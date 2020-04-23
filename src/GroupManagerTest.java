import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author cheny
 *
 */
class GroupManagerTest {

	private GroupManager testGM;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		testGM = new GroupManager();
	}

	/**
	 * Test method for
	 * {@link GroupManager#GroupManager(int, java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	void testGroupManagerIntStringStringStringInt() {
		//private testGM2 = new GroupManager();
	}

	/**
	 * Test method for {@link GroupManager#addNewMember(GroupMember)}.
	 */
	@Test
	void testAddNewMember() {
		StudentUser testUser = new StudentUser();
		testGM.addNewMember(testUser);

	}

	/**
	 * Test method for {@link GroupManager#removeMember(GroupMember)}.
	 */
	@Test
	void testRemoveMember() {
		fail("Not yet implemented");
	}

}
