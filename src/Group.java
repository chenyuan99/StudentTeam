import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Yuan Chen
 * @version 2020-04-11
 */
public class Group {
    private String name;
    private int groupID;
    private GroupManager manager;// tbd
    private ArrayList<GroupMember> members;// tbd

    /**
     * 
     */
    public Group() {
        name = "";
        groupID = -1;
        manager = new GroupManager();
        members = new ArrayList<GroupMember>();
    }


    /**
     * 
     * @param n
     * @param id
     * @param m
     * @param mem
     */
    public Group(String n, int id, GroupManager m, ArrayList<GroupMember> mem) {
        name = n;
        groupID = id;
        manager = m;
        members = mem;
    }


    /**
     * 
     * @return
     */
    public String getName() {
        return name;
    }


    /**
     * 
     * @return
     */
    public GroupManager getManager() {
        return manager;
    }


    /**
     * 
     * @return
     */
    public ArrayList<GroupMember> getMembers() {
        return members;
    }

    /**
     * 
     * @param user student user to be added to the group
     */
    public void addMember(StudentUser user) {
        GroupMember newMember = new GroupMember();
        // copy paste all the information from user to newMember
        members.add(newMember);
    }
}
