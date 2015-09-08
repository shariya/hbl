package test.src.forum;

import org.junit.*;

import forum.FilterBack;

import static org.junit.Assert.*;

/**
 * The class <code>FilterBackTest</code> contains tests for the class <code>{@link FilterBack}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class FilterBackTest {
	/**
	 * Run the String filterAll(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterAll_1()
		throws Exception {
		String string = "";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterAll(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String filterBreak(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterBreak_1()
		throws Exception {
		String string = null;
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterBreak(string);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String filterBreak(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterBreak_2()
		throws Exception {
		String string = "";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterBreak(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String filterBreak(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterBreak_3()
		throws Exception {
		String string = "a";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterBreak(string);

		// add additional test code here
		assertEquals("a", result);
	}

	

	/**
	 * Run the String filterEmoticons(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterEmoticons_1()
		throws Exception {
		String string = "";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterEmoticons(string);

		// add additional test code here
		assertEquals("", result);
	}

	

	/**
	 * Run the String filterImage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterImage_1()
		throws Exception {
		String string = null;
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterImage(string);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String filterImage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterImage_2()
		throws Exception {
		String string = "";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterImage(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String filterImage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterImage_3()
		throws Exception {
		String string = "a";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterImage(string);

		// add additional test code here
		assertEquals("a", result);
	}

	

	/**
	 * Run the String filterTextStyle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterTextStyle_1()
		throws Exception {
		String string = null;
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterTextStyle(string);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String filterTextStyle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterTextStyle_2()
		throws Exception {
		String string = "";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterTextStyle(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String filterTextStyle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterTextStyle_3()
		throws Exception {
		String string = "a";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterTextStyle(string);

		// add additional test code here
		assertEquals("a", result);
	}



	/**
	 * Run the String filterURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterURL_1()
		throws Exception {
		String string = null;
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterURL(string);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String filterURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterURL_2()
		throws Exception {
		String string = "";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterURL(string);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String filterURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFilterURL_3()
		throws Exception {
		String string = "a";
		FilterBack filterBack = new FilterBack();
		String result = filterBack.filterURL(string);

		// add additional test code here
		assertEquals("a", result);
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
		new org.junit.runner.JUnitCore().run(FilterBackTest.class);
	}
}