import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author cheny
 *
 */
class ValidationTest {

	private MainDriver mD;
	private String fileName;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		mD = new MainDriver();
	}


	/**
	 * Test method for {@link MainDriver#main(java.lang.String[])}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testUserCase1() throws FileNotFoundException {
		fileName = "uc1-register.txt";
        String[] args = null;
        System.setIn(new FileInputStream(fileName));
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capturedOut));
        MainDriver.main(args);
        try {
            assertEquals(String.join("", (Files.readAllLines(Paths.get("uc1-solution.txt")))).replaceAll(" ", ""),
                    capturedOut.toString().replaceAll("\\s", "").replaceAll(System.lineSeparator(), ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.setOut(originalOut);
	}

	/**
	 * Test method for {@link MainDriver#main(java.lang.String[])}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testUserCase2() throws FileNotFoundException {
		fileName = "uc2-signin.txt";
        String[] args = null;
        System.setIn(new FileInputStream(fileName));
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(capturedOut));
        MainDriver.main(args);
        try {
            assertEquals(String.join("", (Files.readAllLines(Paths.get("uc2-solution.txt")))).replaceAll(" ", ""),
                    capturedOut.toString().replaceAll("\\s", "").replaceAll(System.lineSeparator(), ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.setOut(originalOut);
	}

	/**
	 * Test method for {@link MainDriver#main(java.lang.String[])}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testUserCase3() throws FileNotFoundException {
		fileName = "uc3-modify.txt";
	 	String[] args = null;
		System.setIn(new FileInputStream(fileName));
		ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(capturedOut));
		MainDriver.main(args);
		try {
			assertEquals(String.join("", (Files.readAllLines(Paths.get("uc3-solution.txt")))).replaceAll("\\s", ""),
					capturedOut.toString().replaceAll("\\s", "").replaceAll(System.lineSeparator(), ""));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setOut(originalOut);
	}

	/**
	 * Test method for {@link MainDriver#main(java.lang.String[])}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testUserCase4() throws FileNotFoundException {
		fileName = "uc4-logout.txt";
		String[] args = null;
        System.setIn(new FileInputStream(fileName));
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(capturedOut));
        MainDriver.main(args);
        try {
            assertEquals(String.join("", (Files.readAllLines(Paths.get("uc4-solution.txt")))).replaceAll(" ", ""),
                    capturedOut.toString().replaceAll("\\s", "").replaceAll(System.lineSeparator(), ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.setOut(originalOut);
	}

	/**
	 * Test method for {@link MainDriver#main(java.lang.String[])}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	void testUserCase5() throws FileNotFoundException {
		fileName = "uc5-removal.txt";
        String[] args = null;
        System.setIn(new FileInputStream(fileName));
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(capturedOut));
        MainDriver.main(args);
        try {
            assertEquals(String.join("", (Files.readAllLines(Paths.get("uc5-solution.txt")))).replaceAll(" ", ""),
                    capturedOut.toString().replaceAll("\\s", "").replaceAll(System.lineSeparator(), ""));
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.setOut(originalOut);
	}
	
}
