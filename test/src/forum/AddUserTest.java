package test.src.forum;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.tomcat.dbcp.dbcp2.DelegatingResultSet;
import org.junit.*;

import forum.AddUser;
import forum.DBConnectie;

import static org.junit.Assert.*;

/**
 * The class <code>AddUserTest</code> contains tests for the class <code>{@link AddUser}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class AddUserTest {
	/**
	 * Run the AddUser() constructor test.
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testAddUser_1()
		throws Exception {
		AddUser result = new AddUser();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testDoGet_1()
		throws Exception {
		AddUser fixture = new AddUser();
		fixture.db = new DBConnectie("", "", "");
		//HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		//HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		//fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
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
		AddUser fixture = new AddUser();
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
		new org.junit.runner.JUnitCore().run(AddUserTest.class);
	}
}