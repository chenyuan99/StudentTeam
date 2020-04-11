import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 * the main class to parse the commands
 *
 * @author Yuan Chen
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
