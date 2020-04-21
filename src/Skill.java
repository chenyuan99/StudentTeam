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
    private void removeDocument(Document d) {
        documents.remove(d);
        System.out.print("Description " + d + "is removed\n");
    }


    public void updateReviews() {
    }


    public void ugetName() {
    }


    public void ugetDescription() {
    }


    public void ugetDocuments() {
    }


    public void ugetReviews() {
    }


    public void usetName(String n) {
        name = n;
    }


    public void usetDescription() {
    }
}
