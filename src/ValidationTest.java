import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
	void testMain() throws FileNotFoundException {
		fileName = "MainTest.txt";
		String[] args = null;
		System.setIn(new FileInputStream(fileName));
		MainDriver.main(args);
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
		MainDriver.main(args);
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
		MainDriver.main(args);
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
		MainDriver.main(args);
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
		MainDriver.main(args);
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
		MainDriver.main(args);
	}

}
