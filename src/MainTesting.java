import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainTesting {

	private String fileName;

	@BeforeEach
	void setUp() throws Exception {
		 fileName = "MainTest.txt";
	}

	@Test
	// running all the user input possibility to make sure, no hiding errors
	void test() throws FileNotFoundException {
		fileName = "MainTest.txt";
		String[] args = null;
		System.setIn(new FileInputStream(fileName));
		MainDriver.main(args);

	}

}
