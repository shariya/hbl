package test.src.forum;

import org.junit.*;

import forum.Variable;

import static org.junit.Assert.*;

/**
 * The class <code>VariableTest</code> contains tests for the class <code>{@link Variable}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class VariableTest {
	/**
	 * Run the Variable() constructor test.
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testVariable_1()
		throws Exception {
		Variable result = new Variable();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getDb() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetDb_1()
		throws Exception {

		String result = Variable.getDb();

		// add additional test code here
		assertEquals("VzConnect", result);
	}

	/**
	 * Run the String getDbLogin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetDbLogin_1()
		throws Exception {

		String result = Variable.getDbLogin();

		// add additional test code here
		assertEquals("root", result);
	}

	/**
	 * Run the String getDbPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetDbPassword_1()
		throws Exception {

		String result = Variable.getDbPassword();

		// add additional test code here
		assertEquals("admin1!", result);
	}

	/**
	 * Run the String getForumName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetForumName_1()
		throws Exception {

		String result = Variable.getForumName();

		// add additional test code here
		assertEquals("My Forum", result);
	}

	/**
	 * Run the String getForumPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetForumPath_1()
		throws Exception {

		String result = Variable.getForumPath();

		// add additional test code here
		assertEquals("..\\forum\\", result);
	}

	/**
	 * Run the String getMessagePerPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetMessagePerPage_1()
		throws Exception {

		String result = Variable.getMessagePerPage();

		// add additional test code here
		assertEquals("10", result);
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
		new org.junit.runner.JUnitCore().run(VariableTest.class);
	}
}