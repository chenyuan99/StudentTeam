
public class Document {

    private int documentID;
    private String fileType;
    private float fileSize;
    public Document() {
        documentID = -1;
        fileType = "";
        fileSize = -1;
    }
    
    /**
     * 
     * @param dID
     * @param fType
     * @param fSize
     */
    public Document(int dID, String fType, float fSize) {
        documentID = dID;
        fileType = fType;
        fileSize = fSize;
    }

}
