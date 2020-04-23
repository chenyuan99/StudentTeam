import java.io.*;
import java.util.HashMap;

public class Database {

    private HashMap<String, HashMap> database;
    private File databaseFile;

    /**
     * This class represents a somewhat generic database model.
     *
     * The database is a HashMap hashed by a primary key (this is a decision of
     * the client using this class). The value is another HashMap.
     *
     * The HashMap stored as the value hashes the key by String and stores the value
     * as String. This is sort of similar to a Dictionary or JSON object.
     *
     * Example of use:
     * HashMap<String, String> record = new HashMap<>();
     *                         record.put("id", "1");
     *                         record.put("first_name", "Jane");
     *                         record.put("last_name", "Doe");
     *
     *                         db.store(record.get("id"), record);
     * The "database" will map the id of 1 -> {"id" : "1", "first_name" : "Jane", "last_name" : "Doe"}
     *
     * @param databaseFileName The filename to supply to the database
     */
    public Database(String databaseFileName) {

        this.databaseFile = new File(databaseFileName);
        this.database = new HashMap<String, HashMap>(100);
        this.loadDatabase();

    }

    /**
     * Uses ObjectInputStream to read a serialized version of the HashMap (since the HashMap class
     * in Java is serializable) from the file.
     *
     * @return true if successful, false otherwise
     */
    public boolean loadDatabase() {

        try {
            // Create the object input stream, this will read a serialized version of our database
            // from the file.
            InputStream inputStream = new FileInputStream(this.databaseFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            // Overwrite the memory representation of the database, this will actually read the
            // serialized hash map representing our database.

            // We cast it to the type of the hashmap which is <String, HashMap>
            this.database = (HashMap<String, HashMap>) objectInputStream.readObject();

            // Close the input streams
            inputStream.close();
            objectInputStream.close();

            return true;

        } catch (FileNotFoundException e) {
            // If the file isn't found that's ok because it's the first run. Just return false;
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return false;

    }

    /**
     * Uses ObjectOutputStream to write a serialized version of the HashMap (since the HashMap class
     * in Java is serializable) to the file.
     *
     * @return true if successful, false otherwise
     */
    public boolean saveDatabase() {
        HashMap<String, String> record = new HashMap<>();
        record.put("id", "12345");
        record.put("first_name", "John");
        record.put("last_name", "Doe");

        this.database.put(record.get("id"), record);

        try {
            // Create the object output stream, this will dump a serialized version of the hashmaps representing
            // our database to a file.
            FileOutputStream outputStream = new FileOutputStream(this.databaseFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // Overwrite the database, this will actually read the serialized hash map representing our database.
            // We cast it to the type of the hashmap which is <String, HashMap>
            objectOutputStream.writeObject(this.database);

            // Close the output streams
            outputStream.close();
            objectOutputStream.close();

            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;

    }

    /**
     * Retrieves the HashMap Object hashed by key in the database.
     *
     * Example:
     * db.get("1") -> {"id" : "1", "first_name" : "Jane", "last_name" : "Doe"}
     *
     * @param key The key to search the database on
     * @return the HashMap object hashed by the key in the database.
     */
    public HashMap<String, String> retrieve(String key) {
        return database.get(key);
    }

    /**
     * Stores a HashMap, hashed by the provided key, into the database.
     *
     * @param key String key to store based on
     * @param value HashMap<String, String> to store in the database
     * @return the stored value
     */
    public HashMap<String, String> store(String key, HashMap<String, String> value) {
        database.put(key, value);
        this.saveDatabase();
        return value;
    }

}
