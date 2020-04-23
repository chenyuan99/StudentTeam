import java.util.ArrayList;
import java.util.Scanner;

/**
 * Man: Helpfully we go with this EZ version LOL
 * 
 * 
 * @author DiaryOfNPC my computer name :) 
 * 
 */
public class MainDriver {

    static boolean logIn = false;
    static int currentUser = -1;
    public static void main(String[] args) {

        ArrayList<StudentUser> usersDB = new ArrayList<StudentUser>();

        Scanner scan = new Scanner(System.in);
        prompt(); // display prompt
        while (scan.hasNext()) {
            int res = scan.nextInt();
            decision(res, usersDB); // decision parser
            System.out.println("");
            prompt(); // display prompt
        }

    }


    public static void prompt() {
        System.out.println("Enter the nubmer to make decision: ");
        System.out.println("1. Add customer profile");
        System.out.println("2. Log into customer profile");
        System.out.println("3. Modify customer profile");
        System.out.println("4. Log out of customer profile");
        System.out.println("5. Remove customer profile");
    }


    /**
     * decision parser
     * 
     * @param choice
     *            user input(decision)
     */
    public static void decision(int choice, ArrayList<StudentUser> db) {
        Scanner sn = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.println("Add customer profile");
                System.out.println("Enter First Name:");
                String fN = sn.nextLine();
                System.out.println("Enter Last Name:");
                String lN = sn.nextLine();
                System.out.println("Enter your Email:");
                String mail = sn.nextLine();
                System.out.println("Enter your Phone number: (number only please)");
                int num = sn.nextInt(); // I think we need to save pNumber as String
                System.out.println("Enter your Major:");
                sn.nextLine(); // skip
                String maj = sn.nextLine();
                System.out.println("Enter your Year: (freshman, sophomore, junior, senior)");
                String yr = sn.nextLine();
                StudentUser s1 = new StudentUser(db.size(), fN, lN, mail, num,
                    maj, yr);
                db.add(s1);
                // System.out.println(db.get(0).toString()); // Just to check if I add the data In correctly.
                System.out.println(
                    "You profile had been created and added into the database");
                break;
            case 2:
                System.out.println("Log into customer profile");
                System.out.println("Enter First Name:");
                String fNIn = sn.nextLine();
                System.out.println("Enter Last Name:");
                String lNIn = sn.nextLine();
                System.out.println("Enter your email:");
                String mailIn = sn.nextLine();
                boolean pass = false;
                for (int i = 0; i < db.size(); i++) {
                    StudentUser temp = db.get(i);
                    if(temp.getFirstName().equals(fNIn) && temp.getLastName().equals(lNIn) && temp.getEmail().equals(mailIn)) {
                        pass = true;
                        currentUser = i;
                    }
                }
                if(pass) {
                    logIn = true;
                    System.out.println(
                        "You logged in, you are allow to use Modify customer profile option !");   
                }else {
                    System.out.println("Error: can't find your account... Bye <3");
                    System.out.println("Useful Error: maybe create an account first so you can log-in???");
                }
                break;
            case 3:
                if(logIn) {
                    System.out.println("Modify customer profile:");
                    modifyHealper(db); // helper method, So the case is not tooo big
                    System.out.println("Your account had been modify");
                }else {
                    System.out.println("You have to log-In to use this option");
                }
                break;
            case 4:
                if(logIn) {
                    System.out.println("Log out of customer profile");
                    System.out.println("you are no longer Log-In");
                    logIn = false;
                    currentUser = -1;
                }else {
                    System.out.println("You have to log-In to use this option");
                }
                break;
            case 5:
                if(logIn) {
                    System.out.println("Remove customer profile");
                    System.out.println("Are you sure????");
                    System.out.println("Enter YES, if you wish to remove your account");
                    if(sn.nextLine().equals("YES")){
                        db.remove(currentUser);
                        logIn = false;
                        currentUser = -1;
                        System.out.println("successfully removed your account! BYE!!!");
                    }else {
                        System.out.println("Error occure: removed account fail...");
                    }
                    
                }else {
                    System.out.println("You have to log-In to use this option");
                }
                break;
            default:
                System.out.println(choice + " bruhhhhh can't do that");
        }

    }
    
    private static void modifyHealper(ArrayList<StudentUser> db) {
        StudentUser temp = db.get(currentUser); // get the current Logged-In user
        
        System.out.println("1. Modify First Name:");
        System.out.println("2. Modify Last Name:");
        System.out.println("3. Modify Email:");
        System.out.println("4. Modify Phone number:");
        System.out.println("5. Modify Major:");
        System.out.println("6. Modify Year:");
        Scanner sn = new Scanner(System.in);
        int res = sn.nextInt();
        sn.nextLine();
        switch(res) {
            case 1:
                System.out.println("Enter new First Name:");
                temp.setFirstName(sn.nextLine());
                break;
            case 2:
                System.out.println("Enter new Last Name:");
                temp.setLastName(sn.nextLine());
                break;
            case 3:
                System.out.println("Enter new Email:");
                temp.setEmail(sn.nextLine());
                break;
            case 4:
                System.out.println("Enter new Phone number: (number only please)");
                temp.setPhoneNumber(sn.nextInt());
                break;
            case 5:
                System.out.println("Enter new Major:");
                sn.nextLine();
                System.out.println("Error: haven't implement it yet exception (Go do it in StudentUser)");
                break;
            case 6:
                System.out.println("Enter new Year: (freshman, sophomore, junior, senior)");
                sn.nextLine();
                System.out.println("Error: haven't implement it yet exception (Go do it in StudentUser)");
                break;
            default:
                System.out.println(res + " bruhhhhh can't do that");
        }
        
        
    }

}
