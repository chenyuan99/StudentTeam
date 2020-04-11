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
    
    /**
     * 
     */
    private void addUserToContactList() {}
    
    /**
     * 
     */
    private void updateReviewsOfOthers() {}
    
    /**
     * 
     */
    private void requestActivation() {}
    
    /**
     * 
     */
    private void authenticate() {}
    
    /**
     * 
     */
    private void removeProfile() {}
    
    /**
     * @return 
     * 
     */
    private String getFirstName() {
        return firstName;
    }
    
    /**
     * @return 
     * 
     */
    private String getLastName() {
        return lastName;
    }
    
    /**
     * @return 
     * 
     */
    private String getEmail() {
        return email;
    }
    
    /**
     * 
     */
    private int getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * 
     */
    private void getContractList() {}
    
    /**
     * 
     */
    private void getReviewsOfOthers() {}
    
    /**
     * 
     */
    private void setFirstName(String newFirst) {
        firstName = newFirst;
        
    }
    
    /**
     * 
     */
    private void setLastName(String newLast) {
        lastName = newLast;
    }
    
    /**
     * 
     */
    private void setEmail(String newEmail) {
        email = newEmail;
    }
    
    /**
     * 
     */
    private void setPhoneNumber() {}

}
