/**
 * 
 */

/**
 * @author cheny
 *
 */
public class GroupMember extends StudentUser {

	private Group group;

	/**
	 * 
	 */
	public GroupMember() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uID
	 * @param fName
	 * @param lName
	 * @param mail
	 * @param pNumber
	 */
	public GroupMember(int uID, String fName, String lName, String mail, int pNumber) {
		super(uID, fName, lName, mail, pNumber);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */
	public Group getGroup() {
		return group;
	}

}
