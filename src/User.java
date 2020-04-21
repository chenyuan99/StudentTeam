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
    private void addUserToContactList() {
    }


    /**
     * 
     */
    private void updateReviewsOfOthers() {
    }


    /**
     * 
     */
    private void requestActivation() {
    }


    /**
     * 
     */
    private void authenticate() {
    }


    /**
     * 
     */
    private void removeProfile() {
    }


    /**
     * @return
     * 
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * @return
     * 
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * @return
     * 
     */
    public String getEmail() {
        return email;
    }


    /**
     * 
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * 
     */
    public void getContractList() {
    }


    /**
     * 
     */
    public void getReviewsOfOthers() {
    }


    /**
     * 
     */
    public void setFirstName(String newFirst) {
        firstName = newFirst;

    }


    /**
     * 
     */
    public void setLastName(String newLast) {
        lastName = newLast;
    }


    /**
     * 
     */
    public void setEmail(String newEmail) {
        email = newEmail;
    }


    /**
     * 
     */
    public void setPhoneNumber(int number) {
        phoneNumber = number;
    }

    // Functions for guest users


    /**
     * 
     */
    public void selectCreateNewProfile() {
        System.out.print("profile creation form\n");
    }


    /**
     * 
     */
    public void submitCreateNewProfile() {
        System.out.print("an email was sent\n");
    }


    /**
     * 
     */
    public void blankField() {
        System.out.print("field left blank warning");
    }

    // Functions for student user


    /**
     * 
     */
    public void authenticateStudentProfile() {
        System.out.print("an email was sent\n");
    }


    /**
     * 
     */
    public void requestAnotherActivationEmail() {
        System.out.print("an email was sent\n");
    }


    /**
     * 
     */
    public void clickActivationLink() {
        System.out.print("site-wide student features are enabled");
    }
   

}
