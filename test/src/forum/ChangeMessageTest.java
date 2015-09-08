package test.src.forum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.junit.*;

import forum.ChangeMessage;
import forum.DBConnectie;

import static org.junit.Assert.*;

/**
 * The class <code>ChangeMessageTest</code> contains tests for the class <code>{@link ChangeMessage}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class ChangeMessageTest {
	/**
	 * Run the ChangeMessage() constructor test.
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testChangeMessage_1()
		throws Exception {
		ChangeMessage result = new ChangeMessage();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void doPost(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testDoPost_1()
		throws Exception {
		ChangeMessage fixture = new ChangeMessage();
		fixture.db = new DBConnectie("", "", "");
		//HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		//HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		//fixture.doPost(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ChangeMessageTest.class);
	}
}