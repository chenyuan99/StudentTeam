import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Yuan Chen
 * @version 04-07-2020
 *
 */
public class User {
    
    private int userID;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    
    public User() {
        userID = -1;
        firstName = "";
        lastName = "";
        email = "";
        phoneNumber = -1;
    }
    
    /**
     * 
     * @param uID
     * @param fName
     * @param lName
     * @param mail
     * @param pNumber
     */
    public User(int uID, String fName, String lName, String mail, int pNumber) {
        userID = uID;
        userID = -1;
        firstName = fName;
        lastName = lName;
        email = mail;
        phoneNumber = pNumber;
    }
}
