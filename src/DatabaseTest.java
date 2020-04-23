import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Dictionary;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    Database db;

    @BeforeEach
    void setUp() throws Exception {
       db =  new Database("test.db");
    }

    @Test
    void testAddingDatabase() {
        System.out.println("Hello");
        HashMap<String, String> record = new HashMap<>();
        record.put("id", "1");
        record.put("first_name", "Jane");
        record.put("last_name", "Doe");

        assertEquals(db.store(record.get("id"), record), record);

        record = new HashMap<>();
        record.put("id", "2");
        record.put("first_name", "John");
        record.put("last_name", "Doe");

        assertEquals(db.store(record.get("id"), record), record);

    }

    @Test
    void testLoadingDatabase() {
        db.loadDatabase();

        assertEquals(db.retrieve("1").get("first_name").equals("Jane"), true);
        assertEquals(db.retrieve("2").get("first_name").equals("John"), true);

    }
}
