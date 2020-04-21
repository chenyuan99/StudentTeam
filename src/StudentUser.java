import java.util.ArrayList;

/**
 * 
 * @author Yuan Chen
 * @version 2020-04-21
 */
public class StudentUser extends User {

    private String major;
    private String year;
    private ArrayList<Group> currentGroup;
    private ArrayList<Group> pastGroup;
    private ArrayList<Skill> skills;

    public StudentUser() {
        major = "";
        year = "";
        currentGroup = new ArrayList<Group>();
        pastGroup = new ArrayList<Group>();
        skills = new ArrayList<Skill>();
    }


    /**
     * 
     * @param uID
     * @param fName
     * @param lName
     * @param mail
     * @param pNumber
     */
    public StudentUser(
        int uID,
        String fName,
        String lName,
        String mail,
        int pNumber) {
        super(uID, fName, lName, mail, pNumber);
        // TODO Auto-generated constructor stub
    }


    /**
     * 
     */
    public void modifyProfile() {
    }


    /**
     * 
     */
    public void submitSkills() {
        System.out.print("Skills are successfully submitted");
    }


    /**
     * 
     */
    public void modifySkills() {
        System.out.print("Skills are successfully modified");
    }


    /**
     * 
     */
    public void createGroup() {
        Group group = new Group();
        currentGroup.add(group);
        System.out.print("New Group " + group.getName() + " is successfully created");
    }


    /**
     * 
     * @return major of the student user
     */
    public String getMajor() {
        return major;
    }


    /**
     * 
     * @return year of the student user
     */
    public String getYear() {
        return year;
    }


    /**
     * 
     * @return
     */
    public ArrayList<Group> getCurrentGroup() {
        return currentGroup;
    }


    /**
     * 
     * @return
     */
    public ArrayList<Group> getPastGroup() {
        return pastGroup;
    }


    /**
     * 
     * @return
     */
    public ArrayList<Skill> getSkills() {
        return skills;
    }

}
