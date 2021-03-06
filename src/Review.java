/**
 * 
 * @author Yuan Chen
 * @version 04/21/2020
 *
 */
public class Review {

	private int score;
	private StudentUser reviewer;
	private String description;
	private int upvotes;
	private int downvotes;

	public Review() {
		score = 0;
		reviewer = new StudentUser();
		description = "";
		upvotes = 0;
		downvotes = 0;
	}

	/**
	 * 
	 * @param s
	 * @param r
	 * @param d
	 * @param u
	 * @param dv
	 */
	public Review(int s, StudentUser r, String d, int u, int dv) {
		score = s;
		reviewer = r;
		description = d;
		upvotes = u;
		downvotes = dv;
	}

	/**
	 * 
	 */
	public void upVotes() {
		upvotes++;
		score();
	}

	/**
	 * 
	 */
	private void score() {
		score = upvotes - downvotes;
	}

	/**
	 * 
	 */
	public void downVotes() {
		downvotes++;
		score();
	}

	/**
	 * 
	 * @return score of the review
	 */
	public int getScore() {
		return score;
	}

	/**
	 * 
	 * @return
	 */
	public StudentUser getReviewer() {
		return reviewer;
	}

	/**
	 * 
	 * @return description of the review
	 */
	public String getDesciption() {
		return description;
	}

	/**
	 * 
	 * @return upvotes number of upvotes
	 */
	public int getUpvotes() {
		return upvotes;
	}

	/**
	 * 
	 * @return downvotes number of down votes
	 */
	public int getDownvotes() {
		return downvotes;
	}
}
