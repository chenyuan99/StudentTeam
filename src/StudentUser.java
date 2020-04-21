import java.util.ArrayList;

public class StudentUser extends User {
    
    private String major;
    private String year;
    private ArrayList<Group> currentGroup;
    private ArrayList<Group> pastGroup;
    private ArrayList<Skill> skills;

    public StudentUser() {
        // TODO Auto-generated constructor stub
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
    
    public void modifyProfile() {}
    public void submitSkills() {}
    public void modifySkills() {}
    public void createGroup() {}
    public void getMajor() {}
    public void getYear() {}
    public void getCurrentGroup() {}
    public void getPastGroup() {}
    public void getSkills() {}

}
