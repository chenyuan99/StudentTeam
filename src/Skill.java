import java.util.ArrayList;

/**
 * 
 * @author Yuan Chen
 * @version 2020-04-21
 *
 */
public class Skill {

    /**
     * 
     */
    private String name;
    private String description;
    private ArrayList<Document> documents;
    private ArrayList<Review> reviews;

    public Skill() {
        name = "";
        description = "";
        documents = new ArrayList<Document>();
        reviews = new ArrayList<Review>();
    }


    /**
     * 
     * @param n
     * @param d
     * @param doc
     * @param r
     */
    public Skill(
        String n,
        String d,
        ArrayList<Document> doc,
        ArrayList<Review> r) {
        name = n;
        description = d;
        documents = doc;
        reviews = r;
    }


    public void addDescription(String d) {
        description = d;
        System.out.print("Description " + d + "is added\n");
    }


    /**
     * 
     * @param d
     */
    public void addDocument(Document d) {
        documents.add(d);
        System.out.print("Description " + d + "is added\n");
    }


    /**
     * 
     * @param d
     */
    public void removeDocument(Document d) {
        documents.remove(d);
        System.out.print("Description " + "is removed\n");
    }


    /**
     * 
     * @param newReviews
     */
    public void updateReviews(ArrayList<Review> newReviews) {
        reviews = newReviews;
        System.out.print("Reviews " + "are updated\n");
    }


    /**
     * 
     * @return name of the skill
     */
    public String getName() {

        return name;

    }


    /**
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * 
     */
    public ArrayList<Document> getDocuments() {
        return documents;
    }


    /**
     * 
     * @return
     */
    public ArrayList<Review> getReviews() {
        return reviews;
    }


    /**
     * 
     * @param n
     */
    public void setName(String n) {
        name = n;
        System.out.print("name is changed to " + name + "\n");
    }


    /**
     * 
     * @param d
     */
    public void setDescription(String d) {
        description = d;
    }
}
