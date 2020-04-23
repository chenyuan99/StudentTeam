import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Most of methods from most of the class will not be implemented!
 * We design the project for web-dev. Design was to use full stack + server side + database 
 * But since we only implementing a simulator for 5 use-cases
 * Full stack - become console
 * server side - become main method
 * database - become a simulator database
 * 
 * 
 * @author Yuan Chen
 * @version 04-07-2020
 * @editor Man
 * ...
 */
public class User {

    private int userID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private ArrayList<String> contactList;
    private ArrayList<Review> reviews; 
    
    
    /**
     * empty constructor
     */
    public User() {
        userID = -1;
        firstName = "";
        lastName = "";
        email = "";
        phoneNumber = "";
        contactList = new ArrayList<>();
        reviews = new ArrayList<>();
    }


    /**
     * constructor 
     * 
     * @param uID user ID
     * @param fName first name
     * @param lName last name
     * @param mail email 
     * @param pNumber phonenumer
     */
    public User(int uID, String fName, String lName, String mail, String pNumber) {
        userID = uID;
        firstName = fName;
        lastName = lName;
        email = mail;
        phoneNumber = pNumber;
        contactList = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    /**
     * 
     * @return user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @return user's last name
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * 
     * @return user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @return user's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * 
     * @return a list of user's contract
     */
    public ArrayList<String> getContractList() {
        return contactList;
    }

    /**
     * 
     * @return an list of Reviews
     */
    public ArrayList<Review> getReviewsOfOthers() {
        return reviews;
    }


    /**
     * Will set the first name field to be the following input.
     * 
     * @param newFirst new first name
     */
    public void setFirstName(String newFirst) {
        firstName = newFirst;

    }


   /**
    * Will set the last name field to be the following input.
    * 
    * @param newLast new last name
    */
    public void setLastName(String newLast) {
        lastName = newLast;
    }


    /**
     * Will set the Email field to be the following input.
     * 
     * @param newEmail new email
     */
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    /**
     * Will set the phoneNumber field to be the following input.
     * 
     * @param number new phone number
     */
    public void setPhoneNumber(String number) {
        phoneNumber = number;
    }

    /**
     * toString will return a string representation of this object
     */
    public String toString() {
        return userID + " " + firstName +" " + lastName + " Email: " + email + " " + phoneNumber;
    }
    
    
    
    // methods that are irrelevant, We design have use these methods to interact with live server 
    // which we don't need to implement for the simulator
    public void addUserToContactList() {
        System.out.println("user added to the contract list");
    }
    public void updateReviewsOfOthers() {
        System.out.println("Review updated");
    }
    public void requestActivation() {
        System.out.println("sending activation requestion...");
    }
    public void authenticate() {
        System.out.println("autehntication completed");
    }
    public void removeProfile() {
        System.out.println("removed user account");
    }
    // Functions for guest users
    public void selectCreateNewProfile() {
        System.out.print("profile creation form\n");
    }
    public void submitCreateNewProfile() {
        System.out.print("an email was sent\n");
    }
    // Functions for student user
    public void authenticateStudentProfile() {
        System.out.print("an email was sent\n");
    }
    public void requestAnotherActivationEmail() {
        System.out.print("an email was sent\n");
    }
    public void clickActivationLink() {
        System.out.print("site-wide student features are enabled");
    }
    
}
