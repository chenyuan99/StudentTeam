import java.util.ArrayList;

/**
 * Most of methods from most of the class will not be implemented!
 * We design the project for web-dev. Design was to use full stack + server side + database 
 * But since we only implementing a simulator for 5 use-cases
 * Full stack - become console
 * server side - become main method
 * database - become a simulator database
 * 
 * @author Yuan Chen
 * @version 2020-04-21
 * @editor Man
 * ...
 */
public class StudentUser extends User {

    private String major;
    private String year;
    private ArrayList<Group> currentGroup;
    private ArrayList<Group> pastGroup;
    private ArrayList<Skill> skills;

    /**
     * Empty Constructor
     */
    public StudentUser() {
        major = "";
        year = "";
        currentGroup = new ArrayList<Group>();
        pastGroup = new ArrayList<Group>();
        skills = new ArrayList<Skill>();
    }


    /**
     * Constructor
     * 
     * @param uID
     * @param fName
     * @param lName
     * @param mail
     * @param pNumber
     */
    public StudentUser(int uID, String fName, String lName, String mail, String pNumber, String maj, String yr) {
        super(uID, fName, lName, mail, pNumber);
        major = maj;
        year = yr;
        currentGroup = new ArrayList<Group>();
        pastGroup = new ArrayList<Group>();
        skills = new ArrayList<Skill>();
    }


    // methods that are irrelevant, We design have use these methods to interact with live server 
    // which we don't need to implement for the simulator
    public void modifyProfile() {
        System.out.println("Profile had been modify");
    }
    public void submitSkills() {
        System.out.print("Skills are successfully submitted");
    }
    public void modifySkills() {
        System.out.print("Skills are successfully modified");
    }


    
    
    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }


    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }


    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }


    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }


    /**
     * @return the currentGroup
     */
    public ArrayList<Group> getCurrentGroup() {
        return currentGroup;
    }


    /**
     * @param currentGroup the currentGroup to set
     */
    public void setCurrentGroup(ArrayList<Group> currentGroup) {
        this.currentGroup = currentGroup;
    }


    /**
     * @return the pastGroup
     */
    public ArrayList<Group> getPastGroup() {
        return pastGroup;
    }


    /**
     * @param pastGroup the pastGroup to set
     */
    public void setPastGroup(ArrayList<Group> pastGroup) {
        this.pastGroup = pastGroup;
    }


    /**
     * @return the skills
     */
    public ArrayList<Skill> getSkills() {
        return skills;
    }


    /**
     * @param skills the skills to set
     */
    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }


    /**
     * @return a string representation of this object
     */
    public String toString() {
        return super.toString() + " " + major + " " + year;
    }
    
}
