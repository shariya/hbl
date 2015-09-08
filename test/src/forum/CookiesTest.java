package test.src.forum;

import javax.servlet.http.Cookie;
import org.junit.*;

import forum.Cookies;

import static org.junit.Assert.*;

/**
 * The class <code>CookiesTest</code> contains tests for the class <code>{@link Cookies}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class CookiesTest {
	

	/**
	 * Run the String getCookies(Cookie[],String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetCookies_1()
		throws Exception {
		Cookie[] cookies = new Cookie[] {};
		String cookieName = "";
		String defaultValue = "";

		String result = Cookies.getCookies(cookies, cookieName, defaultValue);

		// add additional test code here
		assertEquals("", result);
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
		new org.junit.runner.JUnitCore().run(CookiesTest.class);
	}
}