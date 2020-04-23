import java.util.Scanner;

/**
 * Provides methods to display the different possible options on the navigation 
 * menu, depending on what kind of user is logged in.
 */
public class NavigationMenu {
	
	/* Universal return options */
	public static final int QUIT = 0;
	public static final int CANCEL = -1;
	
	/* Return options for displayMainMenu() */
	public static final int CREATE_NEW_PROFILE = 1;
	public static final int SIGN_IN = 2;
	public static final int VIEW_PROFILE = 3;
	public static final int EDIT_PROFILE = 4;
	public static final int SIGN_OUT = 5;
	
	/* Return options for displayEditProfile()*/
	public static final int EDIT_FIRST_NAME = 1;
	public static final int EDIT_LAST_NAME = 2;
	public static final int EDIT_EMAIL = 3;
	public static final int EDIT_PHONE_NUMBER = 4;
	public static final int EDIT_MAJOR = 5;
	public static final int EDIT_YEAR = 6;
	
	public static int displayMainMenu(Scanner scan, User user) 
	{
		int choice = -1;
		
		if (user != null) {
			System.out.printf("Welcome %s!\n", user.getFirstName());
			System.out.println("1. View Profile");
			System.out.println("2. Edit Profile");
			System.out.println("3. Sign Out");
			
			switch (choice = scan.nextInt()) {
				case 1: return VIEW_PROFILE;
				case 2: return EDIT_PROFILE;
				case 3: return SIGN_OUT;
				default:
					// unrecognized input, throw error
					break;
			}
		}
		else {
			System.out.println("Welcome Guest!");
			System.out.println("Please input one of the numbers in the menu displayed below to navigate.");
			System.out.println("1. Sign In");
			System.out.println("2. Create New Profile");
			System.out.println("3. Quit");
			
			switch (choice = scan.nextInt()) {
				case 1: return SIGN_IN;
				case 2: return CREATE_NEW_PROFILE;
				case 3: return QUIT;
				default:
					// unrecognized input, throw error
					break;
			}
		}
		
		// return unrecognized input
		return choice;
	}
	
	public static int displayEditProfile(Scanner scan, User user) 
	{
		int choice = -1;
		
		if (scan == null) {
			// unexpected, throw error
			return choice;
		}
		if (user == null) {
			// unexpected, throw error
			return choice;
		}
		
		if (user.getClass() == StudentUser.class) {
			System.out.println("1. Edit First Name");
			System.out.println("2. Edit Last Name");
			System.out.println("3. Edit Email");
			System.out.println("4. Edit Phone Number");
			System.out.println("5. Edit Major");
			System.out.println("6. Edit Year");
			System.out.println("7. Cancel");
			
			switch (choice = scan.nextInt()) {
				case 1: return EDIT_FIRST_NAME;
				case 2: return EDIT_LAST_NAME;
				case 3: return EDIT_EMAIL;
				case 4: return EDIT_PHONE_NUMBER;
				case 5: return EDIT_MAJOR;
				case 6: return EDIT_YEAR;
				case 7: return CANCEL;
				default:
					// unrecognized input, throw error
					break;
			}
		}
		else {
			System.out.println("1. Edit First Name");
			System.out.println("2. Edit Last Name");
			System.out.println("3. Edit Email");
			System.out.println("4. Edit Phone Number");
			System.out.println("5. Cancel");
			
			switch (choice = scan.nextInt()) {
				case 1: return EDIT_FIRST_NAME;
				case 2: return EDIT_LAST_NAME;
				case 3: return EDIT_EMAIL;
				case 4: return EDIT_PHONE_NUMBER;
				case 5: return CANCEL;
				default:
					// unrecognized input, throw error
					break;
			}
		}
		
		return choice;
	}
	
} // end of NavigationMenu class