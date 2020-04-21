import junit.framework.TestCase;

/**
 * 
 * @author Yuan Chen
 * @version 04-21-2020
 *
 */
public class StudentmanagerTest extends TestCase {

    /**
     * test method
     * 
     * @throws IOException
     */
    @SuppressWarnings("static-access")
    public void test() throws Exception {
        Studentmanager manager = new Studentmanager();
        String[] args = new String[4];
        args[0] = "SampleInput.txt";
        manager.main(args);
        assertEquals(args[0], "SampleInput.txt");
    }
}
