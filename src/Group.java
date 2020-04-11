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
    private User manager;// tbd
    private User member;// tbd
    /**
     * 
     */
    public Group() {
        name ="";
        groupID = -1;
        manager = new User();
        member = new User();
    }
    
    /**
     * 
     * @param n
     * @param id
     * @param m
     * @param mem
     */
    public Group(String n, int id, User m, User mem) {
        name = n;
        groupID = id;
        manager = m;
        member = m;
    }
}
