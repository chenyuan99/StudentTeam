/**
 * 
 */

/**
 * @author Yuan Chen
 * @version 2020-04-22
 */
public class GroupManager extends GroupMember {

	private Group group;

	/**
	 * 
	 */
	public GroupManager() {
		super();
	}

	/**
	 * @param uID
	 * @param fName
	 * @param lName
	 * @param mail
	 * @param pNumber
	 */
	public GroupManager(int uID, String fName, String lName, String mail, int pNumber) {
		super(uID, fName, lName, mail, pNumber);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param testUser
	 */
	public void addNewMember(StudentUser testUser) {
		// group.add(newMem)
	}

	/**
	 * 
	 * @param newMem
	 */
	public void removeMember(GroupMember newMem) {
		// group.add(newMem)
		System.out.print(newMem.getName() + "  added to " + group.getName());
	}

}
