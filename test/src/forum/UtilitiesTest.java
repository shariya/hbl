package test.src.forum;

import org.junit.*;

import forum.Utilities;

import static org.junit.Assert.*;

/**
 * The class <code>UtilitiesTest</code> contains tests for the class <code>{@link Utilities}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class UtilitiesTest {
	/**
	 * Run the void addView(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testAddView_1()
		throws Exception {
		String forum_id = "";
		String thread_id = "";

		Utilities.addView(forum_id, thread_id);

		// add additional test code here
	}

	/**
	 * Run the int getMessageLength(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetMessageLength_1()
		throws Exception {
		String forum_id = "";
		String thread_id = "";
		String reply_id = "";

		int result = Utilities.getMessageLength(forum_id, thread_id, reply_id);

		// add additional test code here
		//assertEquals(0, result);
	}

	
	/**
	 * Run the String getMorePages(String,String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetMorePages_1()
		throws Exception {
		String replies = "0";
		String forum_id = "a";
		String thread_id = "a";
		boolean pages = true;

		String result = Utilities.getMorePages(replies, forum_id, thread_id, pages);

		// add additional test code here
		//assertEquals("", result);
	}

	

	/**
	 * Run the String getReplies(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetReplies_1()
		throws Exception {
		String forum_id = "";
		String thread_id = "";

		String result = Utilities.getReplies(forum_id, thread_id);

		// add additional test code here
		//assertEquals(null, result);
	}

	

	/**
	 * Run the String getThreadTile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetThreadTile_1()
		throws Exception {
		String forum_id = "";
		String thread_id = "";

		String result = Utilities.getThreadTile(forum_id, thread_id);

		// add additional test code here
		//assertEquals(null, result);
	}

	
	/**
	 * Run the String getTopics(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetTopics_1()
		throws Exception {
		String forum_id = "";

		String result = Utilities.getTopics(forum_id);

		// add additional test code here
		//assertEquals(null, result);
	}



	/**
	 * Run the String getViews(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetViews_1()
		throws Exception {
		String forum_id = "";
		String thread_id = "";

		String result = Utilities.getViews(forum_id, thread_id);

		// add additional test code here
		//assertEquals(null, result);
	}

	

	


	/**
	 * Run the String getforumReplies(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetforumReplies_1()
		throws Exception {
		String forum_id = "";

		String result = Utilities.getforumReplies(forum_id);

		// add additional test code here
		//assertEquals(null, result);
	}

	

	/**
	 * Run the String getforumTile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testGetforumTile_1()
		throws Exception {
		String forum_id = "";

		String result = Utilities.getforumTile(forum_id);

		// add additional test code here
		//assertEquals(null, result);
	}

	

	/**
	 * Run the String lastActionInfo(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testLastActionInfo_1()
		throws Exception {
		String forum_id = "";
		String thread_id = "";

		String result = Utilities.lastActionInfo(forum_id, thread_id);

		// add additional test code here
		//assertNotNull(result);
	}

	
	/**
	 * Run the String lastPostInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testLastPostInfo_1()
		throws Exception {
		String forum_id = "";

		String result = Utilities.lastPostInfo(forum_id);

		// add additional test code here
		//assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(UtilitiesTest.class);
	}
}