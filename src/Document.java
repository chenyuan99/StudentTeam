import java.io.*;
import java.util.*;

/**
 * 
 * @author Yuan Chen
 * @version 2020-04-22
 *
 */
public class Document {

	private int documentID;
	private String fileType;
	private float fileSize;
	private String name;

	public Document() {
		documentID = -1;
		fileType = "";
		fileSize = -1;
		name = "";
	}

	/**
	 * 
	 * @param dID
	 * @param fType
	 * @param fSize
	 */
	public Document(int dID, String fType, float fSize, String docName) {
		documentID = dID;
		fileType = fType;
		fileSize = fSize;
		name = docName;
	}

	/**
	 * 
	 * @return name of the file
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return fileType type of the file
	 */
	public String getFileType() {
		return fileType;

	}

	/**
	 * 
	 * @return fileSize size of the file
	 */
	public float getFileSzie() {
		return fileSize;

	}

}
