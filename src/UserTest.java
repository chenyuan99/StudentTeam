import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    private User testUser; 
    
    @BeforeEach
    void setUp() throws Exception {
        testUser = new User();
    }


    @Test
    void test() {
        testUser.selectCreateNewProfile();
        testUser.submitCreateNewProfile();
        assertEquals(testUser.getFirstName(), "");
    }

}
