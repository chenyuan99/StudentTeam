import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// On my honor:
//
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project with
// anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.

/**
 * the main class to parse the commands
 *
 * @author Yuan Chen
 * @author Jiaying Gong
 * @version 2019-10-02
 *
 */
@SuppressWarnings("unused")
public class Studentmanager {
    /**
     * @author Yuan Chen
     * @version 2019-10-24
     * @param args
     *            name of the command file
     * @throws IOException
     *
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("No argument");
        }
        beginParsingByLine(args[0], args);
    }


    /**
     * parser to read
     *
     * @param filename
     *            file name
     * @param args arguments
     */
    public static void beginParsingByLine(String filename, String[] args) {
        try {
            Scanner sc = new Scanner(new File(filename));
            Scanner scancmd;
            // Declare two scanners one to read the file and one
            // to read the text pulled from the file
            Clientcode cc = new Clientcode(args);
            while (sc.hasNextLine()) {
                // While we have text to read
                String line = sc.nextLine();
                // Get our next line
                scancmd = new Scanner(line);
                // Create a scanner from this line
                while (!scancmd.hasNext()) {
                    if (sc.hasNextLine()) {
                        line = sc.nextLine();
                        // Get our next line
                        scancmd = new Scanner(line);
                    }
                    else {
                        break;
                    }
                }
                String cmd = scancmd.next();
                // Get the first word (the command)
                // on each line
                String type;
                switch (cmd) {
                    case "loadstudentdata":
                        cc.loadstudentdata(scancmd.next());
                        break;
                    case "insert":// insert <pid#> <full name>
                        String tempPID = scancmd.next();
                        String tempFirst = scancmd.next();
                        String tempName1 = scancmd.next();
                        cc.insert(tempPID, tempFirst + " " + tempName1);
                        break;
                    case "update":// update <pid#> <full name>
                        String tempPID1 = scancmd.next();
                        String tempFirst1 = scancmd.next();
                        String tempName11 = scancmd.next();
                        cc.update(tempPID1, tempFirst1 + " " + tempName11);
                        break;
                    case "essay":
                        if (scancmd.next().contains("off")) {
                            break;
                        }
                        String tempLine = sc.nextLine();
                      //  String tempLine2 = sc.nextLine();
                        String essay = "";
                     //   System.out.println("len: " + tempLine.length());
                        while (!tempLine.contains("essay off")) {
                            essay = essay + tempLine + System.lineSeparator();
                            tempLine = sc.nextLine();
                        }
                      //  System.out.println("len: " + essay.length());
                      //  essay = essay - System.lineSeparator();
                        cc.essay(essay);
                        break;
                    case "search":
                        cc.search(scancmd.next());
                        break;
                    case "remove":
                        cc.remove(scancmd.next());
                        break;
                    case "clear":
                        // clear <pid#>
                        cc.clear(scancmd.next());
                        break;
                    case "print":
                        cc.print();
                        break;
                    default:
                        System.out.println("Unrecognized input");
                        break;
                }
            }
        }
        catch (

        Exception e) {
            e.printStackTrace();
        }
    }
}
