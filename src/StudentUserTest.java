import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Yuan Chen
 * @version 2020-04-21
 */
class StudentUserTest {

    private StudentUser apple;
    private StudentUser banana;

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        apple = new StudentUser();
        banana = new StudentUser();
    }


    @Test

    /**
     * 
     */
    public void testmodifyProfile() {
        apple.modifyProfile();
    }


    /**
     * 
     */
    public void testSubmitSkills() {
        apple.submitSkills();
        System.out.print("Skills are successfully submitted");
    }


    /**
     * 
     */
    public void testModifySkills() {
        apple.modifySkills();
        System.out.print("Skills are successfully modified");
    }


    /**
     * 
     */
    public void createGroup() {
        apple.createGroup();
    }


    /**
     * 
     * @return major of the student user
     */
    public void testGetMajor() {
        assertEquals(banana.getMajor(), "");
        assertEquals(banana.getYear(), "");
    }

// /**
// *
// * @return
// */
// public ArrayList<Group> getCurrentGroup() {
// return currentGroup;
// }
//
//
// /**
// *
// * @return
// */
// public ArrayList<Group> getPastGroup() {
// return pastGroup;
// }
//
//
// /**
// *
// * @return
// */
// public ArrayList<Skill> getSkills() {
// return skills;
// }

}
