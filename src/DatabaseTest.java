import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    Database<String, User> db;

    @BeforeEach
    void setUp() throws Exception {
       db =  new Database<String, User>("test.db");
    }

    @Test
    void testAddingDatabase() {
        User testUser = new User(1, "John","Doe", "jdoe@vt.edu", "0001110000", "janewhereareyou");
        assertEquals(db.store(testUser.getEmail(),testUser), testUser);
    }

    @Test
    void testLoadingDatabase() {
        db.loadDatabase();
        assertEquals(db.retrieve("jdoe@vt.edu").getFirstName().equals("John"), true);
    }


    @Test
    void testRemoveFromDatabase() {
        User testUser = new User(1, "John","Doe", "jdoe@vt.edu", "0001110000", "janewhereareyou");
        User testUser2 = new User(1, "John","Doe", "jdoe@null.edu", "0001110000", "janewhereareyou");
        assertEquals(db.remove(testUser2.getEmail()), null);
        assertEquals(db.remove(testUser.getEmail()).getFirstName(), testUser.getFirstName());
        assertEquals(db.store(testUser.getEmail(),testUser), testUser); // Add it back in for the other tests that rely on it
    }
    
}
