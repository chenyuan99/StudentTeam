import static org.junit.jupiter.api.Assertions.*;

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
class ReviewTest {

	private Review testReview;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		testReview = new Review();
	}

	/**
	 * Test method for {@link Review#Review()}.
	 */
	@Test
	void testReview() {
		assertEquals(testReview.getDesciption(), "");
	}

	/**
	 * Test method for
	 * {@link Review#Review(int, StudentUser, java.lang.String, int, int)}.
	 */
	@Test
	void testReviewIntStudentUserStringIntInt() {
		assertEquals(testReview.getDesciption(), "");
	}

	/**
	 * Test method for {@link Review#upVotes()}.
	 */
	@Test
	void testUpVotes() {
		assertEquals(testReview.getUpvotes(), 0);
		testReview.upVotes();
		assertEquals(testReview.getUpvotes(), 1);
	}

	/**
	 * Test method for {@link Review#downVotes()}.
	 */
	@Test
	void testDownVotes() {
		assertEquals(testReview.getDownvotes(), 0);
		testReview.downVotes();
		assertEquals(testReview.getDownvotes(), 1);
	}

	/**
	 * Test method for {@link Review#getScore()}.
	 */
	@Test
	void testGetScore() {
		assertEquals(testReview.getScore(), 0);
	}

	/**
	 * Test method for {@link Review#getReviewer()}.
	 */
	@Test
	void testGetReviewer() {
		assertEquals(testReview.getReviewer().getFirstName(), "");
	}

	/**
	 * Test method for {@link Review#getDesciption()}.
	 */
	@Test
	void testGetDesciption() {
		assertEquals(testReview.getDesciption(), "");
	}

	/**
	 * Test method for {@link Review#getUpvotes()}.
	 */
	@Test
	void testGetUpvotes() {
		assertEquals(testReview.getUpvotes(), 0);
	}

	/**
	 * Test method for {@link Review#getDownvotes()}.
	 */
	@Test
	void testGetDownvotes() {
		assertEquals(testReview.getDownvotes(), 0);
	}

}
