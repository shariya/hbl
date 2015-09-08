package test.src.forum;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	DeleteForumTest.class,
	ChangeProfileTest.class,
	CookiesTest.class,
	DeleteThreadTest.class,
	FilterBackTest.class,
	ChangeMessageTest.class,
	LoginTest.class,
	DBConnectieTest.class,
	LogoutTest.class,
	AddUserTest.class,
	DeleteReplyTest.class,
	AddForumTest.class,
	AddThreadTest.class,
	AddReplyTest.class,
	IncludeTest.class,
	VariableTest.class,
	UtilitiesTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
