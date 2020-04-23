import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Yuan Chen
 * @version 2020-04-23
 *
 */
class SkillTest {

	private Skill testSkill;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		testSkill = new Skill();
	}

	/**
	 * Test method for {@link Skill#Skill()}. done
	 */
	@Test
	void testSkill() {
		assertEquals(testSkill.getName(), "");
	}

	/**
	 * Test method for
	 * {@link Skill#Skill(java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList)}.
	 * tbd
	 */
	@Test
	void testSkillStringStringArrayListOfDocumentArrayListOfReview() {
		assertEquals(testSkill.getName(), "");
	}

	/**
	 * Test method for {@link Skill#addDescription(java.lang.String)}. done
	 */
	@Test
	void testAddDescription() {
		testSkill.addDescription("test 123");
		assertEquals(testSkill.getDescription(), "test 123");
	}

	/**
	 * Test method for {@link Skill#addDocument(Document)}. done
	 */
	@Test
	void testAddDocument() {
		Document testDoc = new Document();
		testSkill.addDocument(testDoc);
		assertEquals(testSkill.getDocuments().size(), 1);
	}

	/**
	 * Test method for {@link Skill#removeDocument(Document)}. done
	 */
	@Test
	void testRemoveDocument() {
		Document testDoc = new Document();
		testSkill.addDocument(testDoc);
		assertEquals(testSkill.getDocuments().size(), 1);
		testSkill.removeDocument(testDoc);
		assertEquals(testSkill.getDocuments().size(), 0);
	}

	/**
	 * Test method for {@link Skill#updateReviews(java.util.ArrayList)}.
	 */
	@Test
	void testUpdateReviews() {
		testSkill.updateReviews(new ArrayList<Review>());
		assertEquals(testSkill.getReviews().size(), 0);
	}

	/**
	 * Test method for {@link Skill#getName()}. done
	 */
	@Test
	void testGetName() {
		assertEquals(testSkill.getName(), "");
	}

	/**
	 * Test method for {@link Skill#getDescription()}. done
	 */
	@Test
	void testGetDescription() {
		assertEquals(testSkill.getDescription(), "");
	}

	/**
	 * Test method for {@link Skill#getDocuments()}. done
	 */
	@Test
	void testGetDocuments() {
		assertEquals(testSkill.getDocuments().size(), 0);
	}

	/**
	 * Test method for {@link Skill#getReviews()}.
	 */
	@Test
	void testGetReviews() {
		assertEquals(testSkill.getReviews().size(), 0);
	}

	/**
	 * Test method for {@link Skill#setName(java.lang.String)}.done
	 */
	@Test
	void testSetName() {
		assertEquals(testSkill.getName(), "");
		testSkill.setName("Java");
		assertEquals(testSkill.getName(), "Java");
	}

	/**
	 * Test method for {@link Skill#setDescription(java.lang.String)}.done
	 */
	@Test
	void testSetDescription() {
		assertEquals(testSkill.getDescription(), "");
		testSkill.setDescription("Java");
		assertEquals(testSkill.getDescription(), "Java");
	}

}
