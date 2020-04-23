import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Dictionary;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    Database<String, User> db;

    @BeforeEach
    void setUp() throws Exception {
       db =  new Database<String, User>("test.db");
    }

    @Test
    void testAddingDatabase() {

        User testUser = new User(1, "John","Doe", "jdoe@vt.edu", "0001110000");
        assertEquals(db.store(testUser.getEmail(),testUser), testUser);

    }

    @Test
    void testLoadingDatabase() {
        db.loadDatabase();
        assertEquals(db.retrieve("jdoe@vt.edu").getFirstName().equals("John"), true);

    }
}
