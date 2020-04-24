import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class will test methods from User class
 * 
 * @author Man
 * ..
 */
class UserTest {
   
    private User opUser;
    private User testUser; 
    
    @BeforeEach
    void setUp() throws Exception {
        opUser = new User(0,"man","man","man@emai.com","5401234561", "guypls");
        testUser = new User();
    }


    @Test
    // this part will test getter and setter
    // use setter to change data then use getter to check with assert  
    void test() {     
        opUser.setFirstName("manF");
        opUser.setLastName("manL");
        opUser.setEmail("man@email.com");
        opUser.setPhoneNumber("1112223334");
        assertEquals(opUser.getFirstName(), "manF");
        assertEquals(opUser.getLastName(), "manL");
        assertEquals(opUser.getEmail(), "man@email.com");
        assertEquals(opUser.getPhoneNumber(), "1112223334");
        assertEquals(opUser.getContractList().size(), 0);
        assertEquals(opUser.getReviewsOfOthers().size(), 0);
        assertEquals(opUser.toString(), "0 manF manL Email: man@email.com 1112223334");
             
    }
    
    @Test
    // below are the irrelevant methods: keep it, just to be in line with the real project
    void testIR() {
        testUser.addUserToContactList();
        testUser.updateReviewsOfOthers();
        testUser.requestActivation();
        testUser.authenticate();
        testUser.removeProfile();
        testUser.selectCreateNewProfile();
        testUser.submitCreateNewProfile();
        testUser.authenticateStudentProfile();
        testUser.requestAnotherActivationEmail();
        testUser.clickActivationLink();
    }
    

}
