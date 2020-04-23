/**
 * 
 */

/**
 * @author Yuan Chen
 * @version 2020-04-22
 *
 */
public class GroupMember extends StudentUser {

	private Group group;

	/**
	 * 
	 */
	public GroupMember() {
		group = new Group();
	}

	/**
	 * @param uID
	 * @param fName
	 * @param lName
	 * @param mail
	 * @param pNumber
	 * 
	 *                need to be updated
	 */
	public GroupMember(int uID, String fName, String lName, String mail, int pNumber) {
		// super(uID, fName, lName, mail, pNumber);
		super();
	}

	/**
	 * 
	 * @return group of the group member
	 */
	public Group getGroup() {
		return group;
	}

}
