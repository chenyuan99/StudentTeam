import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Yuan Chen
 * @version 2020-04-22
 *
 */
class DocumentTest {

	private Document testDoc;

	@BeforeEach
	void setUp() throws Exception {
		testDoc = new Document();
	}

	@Test
	void testGetFileType() {
		assertEquals(testDoc.getFileType(), "");
		assertEquals(testDoc.getName(), "");

	}

	/**
	 * 
	 */
	void testGetName() {
		assertEquals(testDoc.getName(), "");

	}

}
