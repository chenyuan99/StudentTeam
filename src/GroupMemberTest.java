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
class GroupMemberTest {

	private GroupMember testGM;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		testGM = new GroupMember();
	}

	/**
	 * Test method for {@link GroupMember#GroupMember()}.
	 */
	@Test
	void testGroupMember() {
		assertEquals(testGM.getName(), "");
	}

	/**
	 * Test method for
	 * {@link GroupMember#GroupMember(int, java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	void testGroupMemberIntStringStringStringInt() {
		assertEquals(testGM.getName(), "");
	}

	/**
	 * Test method for {@link GroupMember#getGroup()}.
	 */
	@Test
	void testGetGroup() {
		assertEquals(testGM.getGroup().getName(), "");
	}

}
