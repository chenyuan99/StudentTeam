import java.io.*;
import java.util.HashMap;

/**
 * This class represents a somewhat generic database model.
 *
 * The database is a HashMap hashed by a primary key (this is a decision of
 * the client using this class) of type K.
 *
 * The Value stored in the HashMap is of type V. (Specified by the client).
 * @param <K> Primary Key
 * @param <V> Object stored by the Key (Think column).
 */
public class Database <K, V> {

    private HashMap<K, V> database;
    private File databaseFile;

    /**
     *
     *
     * V must be
     *
     * @param databaseFileName The filename to supply to the database
     */
    public Database(String databaseFileName) {

        this.databaseFile = new File(databaseFileName);
        this.database = new HashMap<K, V>(100);
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
            this.database = (HashMap<K, V>) objectInputStream.readObject();

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
     * db.get("1") -> User() with id of 1.
     *
     * @param key The key to search the database on
     * @return the HashMap object hashed by the key in the database.
     */
    public V retrieve(K key) {
        return database.get(key);
    }

    /**
     * Stores a HashMap, hashed by the provided key, into the database.
     *
     * @param key Key to store by
     * @param value Object to store in the database
     * @return the stored value
     */
    public V store(K key, V value) {
        database.put(key, value);
        this.saveDatabase();
        return (V) value;
    }

    /**
     * Removes an entry from the database.
     *
     * @param key Key to remove from database
     * @return the removed value
     */
    public V remove(K key) {
        V removedItem = database.remove(key);
        this.saveDatabase();
        return removedItem;
    }

}
