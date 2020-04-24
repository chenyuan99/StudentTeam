import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class will test the methods from StudentUser class
 * 
 * @author Yuan Chen
 * @version 2020-04-21
 * @editor Man
 * ...
 */
class StudentUserTest {

    private StudentUser apple;
    private StudentUser opStudentUser;

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        apple = new StudentUser();
        opStudentUser = new StudentUser(1,"man","man", "man@email.c","5401234564", "cs", "senior", "nothavingittoday");
    }


    @Test
    /**
     * This will test getter and setter
     */
    public void testGetterSetter() {
        opStudentUser.setMajor("cmda");
        assertEquals(opStudentUser.getMajor(), "cmda");
        opStudentUser.setYear("junior");
        assertEquals(opStudentUser.getYear(), "junior");
        
        assertEquals(opStudentUser.toString(), "1 man man Email: man@email.c 5401234564 cmda junior");
    }


    @Test
    /**
     * // below are the irrelevant methods: keep it, just to be in line with the real project
     */
    public void testIR() {
        apple.modifyProfile();
        apple.submitSkills();
        apple.modifySkills();
    }
    
    
}
