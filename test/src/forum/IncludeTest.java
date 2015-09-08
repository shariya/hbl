package test.src.forum;

import org.junit.*;

import forum.Include;

import static org.junit.Assert.*;

/**
 * The class <code>IncludeTest</code> contains tests for the class <code>{@link Include}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class IncludeTest {
	/**
	 * Run the Include() constructor test.
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testInclude_1()
		throws Exception {
		Include result = new Include();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String Table_body(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testTable_body_1()
		throws Exception {
		String body = "";
		int width = 1;

		String result = Include.Table_body(body, width);

		// add additional test code here
		assertEquals("<TD align=\"left\" valign=\"top\" width=\"1\"><FONT face=Verdana,Arial,Helvetica color=#003366 size=1></FONT></TD>", result);
	}

	/**
	 * Run the String Table_close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testTable_close_1()
		throws Exception {

		String result = Include.Table_close();

		// add additional test code here
		assertEquals("</TABLE></TD></TR></TABLE>", result);
	}

	/**
	 * Run the String Table_close_body() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testTable_close_body_1()
		throws Exception {

		String result = Include.Table_close_body();

		// add additional test code here
		assertEquals("</TR>", result);
	}

	/**
	 * Run the String Table_start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testTable_start_1()
		throws Exception {

		String result = Include.Table_start();

		// add additional test code here
		assertEquals("<TABLE cellSpacing=\"0\" cellPadding=\"0\" width=\"90%\" bgColor=\"#336699\" border=\"0\" align=\"center\">\n<TR>\n<TD>\n<TABLE cellSpacing=\"1\" cellPadding=\"8\" width=\"100%\" border=\"0\">\n<TR bgColor=\"#FFFF99\">\n", result);
	}

	/**
	 * Run the String Table_start_body() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testTable_start_body_1()
		throws Exception {

		String result = Include.Table_start_body();

		// add additional test code here
		assertEquals("<TR bgColor=#ffffff>", result);
	}

	/**
	 * Run the String Table_start_title() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testTable_start_title_1()
		throws Exception {

		String result = Include.Table_start_title();

		// add additional test code here
		assertEquals("<TR bgColor=#FFFF99>", result);
	}

	/**
	 * Run the String Table_title(String,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testTable_title_1()
		throws Exception {
		String title = "";
		int colspan = 1;
		String align = "";

		String result = Include.Table_title(title, colspan, align);

		// add additional test code here
		assertEquals("<TD align=\"\" colspan=\"1\"><FONT face=Verdana,Arial,Helvetica color=#003366 size=1><B></B></FONT></TD>", result);
	}

	/**
	 * Run the String avatars() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testAvatars_1()
		throws Exception {

		String result = Include.avatars();

		// add additional test code here
		assertEquals("<select name=\"avatar_list\" size=\"10\" onchange=\"document.images.img.src=document.profile.avatar_list.options[document.profile.avatar_list.selectedIndex].value;document.profile.link_avatar.value=document.profile.avatar_list.options[document.profile.avatar_list.selectedIndex].value;\">\n<option value=\"../avatars/avatar_0.jpg\">Avatar 0</option>\n<option value=\"../avatars/avatar_1.jpg\">Avatar 1</option>\n<option value=\"../avatars/avatar_2.jpg\">Avatar 2</option>\n<option value=\"../avatars/avatar_3.jpg\">Avatar 3</option>\n<option value=\"../avatars/avatar_4.jpg\">Avatar 4</option>\n<option value=\"../avatars/avatar_5.jpg\">Avatar 5</option>\n<option value=\"../avatars/avatar_6.jpg\">Avatar 6</option>\n<option value=\"../avatars/avatar_7.jpg\">Avatar 7</option>\n<option value=\"../avatars/avatar_8.jpg\">Avatar 8</option>\n<option value=\"../avatars/avatar_9.jpg\">Avatar 9</option>\n<option value=\"../avatars/avatar_10.jpg\">Avatar 10</option>\n<option value=\"../avatars/avatar_11.jpg\">Avatar 11</option>\n<option value=\"../avatars/avatar_12.jpg\">Avatar 12</option>\n<option value=\"../avatars/avatar_13.jpg\">Avatar 13</option>\n<option value=\"../avatars/avatar_14.jpg\">Avatar 14</option>\n<option value=\"../avatars/avatar_15.jpg\">Avatar 15</option>\n<option value=\"../avatars/avatar_16.jpg\">Avatar 16</option>\n<option value=\"../avatars/avatar_17.jpg\">Avatar 17</option>\n<option value=\"../avatars/avatar_18.jpg\">Avatar 18</option>\n<option value=\"../avatars/avatar_19.jpg\">Avatar 19</option>\n<option value=\"../avatars/avatar_20.jpg\">Avatar 20</option>\n<option value=\"../avatars/avatar_21.jpg\">Avatar 21</option>\n<option value=\"../avatars/avatar_22.jpg\">Avatar 22</option>\n<option value=\"../avatars/avatar_23.jpg\">Avatar 23</option>\n<option value=\"../avatars/avatar_24.jpg\">Avatar 24</option>\n<option value=\"../avatars/avatar_25.jpg\">Avatar 25</option>\n<option value=\"../avatars/avatar_26.jpg\">Avatar 26</option>\n<option value=\"../avatars/avatar_27.jpg\">Avatar 27</option>\n<option value=\"../avatars/avatar_28.jpg\">Avatar 28</option>\n<option value=\"../avatars/avatar_29.jpg\">Avatar 29</option>\n<option value=\"../avatars/avatar_30.jpg\">Avatar 30</option>\n<option value=\"../avatars/avatar_31.jpg\">Avatar 31</option>\n<option value=\"../avatars/avatar_32.jpg\">Avatar 32</option>\n<option value=\"../avatars/avatar_33.jpg\">Avatar 33</option>\n<option value=\"../avatars/avatar_34.jpg\">Avatar 34</option>\n<option value=\"../avatars/avatar_35.jpg\">Avatar 35</option>\n<option value=\"../avatars/avatar_36.jpg\">Avatar 36</option>\n<option value=\"../avatars/avatar_37.jpg\">Avatar 37</option>\n<option value=\"../avatars/avatar_38.jpg\">Avatar 38</option>\n<option value=\"../avatars/avatar_39.jpg\">Avatar 39</option>\n<option value=\"../avatars/avatar_40.jpg\">Avatar 40</option>\n<option value=\"../avatars/avatar_41.jpg\">Avatar 41</option>\n<option value=\"../avatars/avatar_42.jpg\">Avatar 42</option>\n<option value=\"../avatars/avatar_43.jpg\">Avatar 43</option>\n<option value=\"../avatars/avatar_44.jpg\">Avatar 44</option>\n<option value=\"../avatars/avatar_45.jpg\">Avatar 45</option>\n<option value=\"../avatars/avatar_46.jpg\">Avatar 46</option>\n<option value=\"../avatars/avatar_47.jpg\">Avatar 47</option>\n<option value=\"../avatars/avatar_48.jpg\">Avatar 48</option>\n<option value=\"../avatars/avatar_49.jpg\">Avatar 49</option>\n<option value=\"../avatars/avatar_50.jpg\">Avatar 50</option>\n<option value=\"../avatars/avatar_51.jpg\">Avatar 51</option>\n<option value=\"../avatars/avatar_52.jpg\">Avatar 52</option>\n<option value=\"../avatars/avatar_53.jpg\">Avatar 53</option>\n<option value=\"../avatars/avatar_54.jpg\">Avatar 54</option>\n</select>\n", result);
	}



	/**
	 * Run the String body() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testBody_1()
		throws Exception {

		String result = Include.body();

		// add additional test code here
		assertEquals("<Body>\n<center><a href=\"..\\forum\\index.jsp\"><img src=\"..\\forum\\logo.jpg\" border=\"0\"></a></center>\n<br>\n", result);
	}

	

	/**
	 * Run the String emoticons() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testEmoticons_1()
		throws Exception {

		String result = Include.emoticons();

		// add additional test code here
		assertEquals("<table cellSpacing=\"0\" cellPadding=\"5\" width=\"100%\">\n<tr>\n<td width=100><a onclick=javascript:form.message.value+=\":mellow:\";form.message.focus();><img src=./emoticons/mellow.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":huh:\";form.message.focus();><img src=./emoticons/huh.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":rolleyes:\";form.message.focus();><img src=./emoticons/rolleyes.gif border=0></a></td>\n</tr>\n<tr>\n<td width=100><a onclick=javascript:form.message.value+=\":lol:\";form.message.focus();><img src=./emoticons/lol.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":wub:\";form.message.focus();><img src=./emoticons/wub.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":angry:\";form.message.focus();><img src=./emoticons/angry.gif border=0></a></td>\n</tr>\n<tr>\n<td width=100><a onclick=javascript:form.message.value+=\":unsure:\";form.message.focus();><img src=./emoticons/unsure.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":wacko:\";form.message.focus();><img src=./emoticons/wacko.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":blink:\";form.message.focus();><img src=./emoticons/blink.gif border=0></a></td>\n</tr>\n<tr>\n<td width=100><a onclick=javascript:form.message.value+=\":ph34r:\";form.message.focus();><img src=./emoticons/ph34r.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":wacko:\";form.message.focus();><img src=./emoticons/wacko.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":bounce:\";form.message.focus();><img src=./emoticons/bounce.gif border=0></a></td>\n</tr>\n<tr>\n<td width=100><a onclick=javascript:form.message.value+=\":fuck:\";form.message.focus();><img src=./emoticons/fuck.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":scream:\";form.message.focus();><img src=./emoticons/scream.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":silly:\";form.message.focus();><img src=./emoticons/silly.gif border=0></a></td>\n</tr>\n<tr>\n<td width=100><a onclick=javascript:form.message.value+=\":frusty:\";form.message.focus();><img src=./emoticons/frusty.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":kwijl:\";form.message.focus();><img src=./emoticons/kwijl.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":puke:\";form.message.focus();><img src=./emoticons/puke.gif border=0></a></td>\n</tr>\n<tr>\n<td width=100><a onclick=javascript:form.message.value+=\":bid:\";form.message.focus();><img src=./emoticons/bid.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":hammer:\";form.message.focus();><img src=./emoticons/hammer.gif border=0></a></td>\n<td width=100><a onclick=javascript:form.message.value+=\":good:\";form.message.focus();><img src=./emoticons/good.gif border=0></a></td>\n</tr></table>\n", result);
	}

	/**
	 * Run the String footer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testFooter_1()
		throws Exception {

		String result = Include.footer();

		// add additional test code here
		assertEquals("<br><center>&copy; 2002 by <a href=mailto:grieks03@ie.hva.nl>Erwin</a></center></Body>\n</Html>\n", result);
	}

	/**
	 * Run the String header(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testHeader_1()
		throws Exception {
		String title = "";

		String result = Include.header(title);

		// add additional test code here
		assertEquals("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n<Html>\n<Head>\n<Title></Title>\n</Head>\n", result);
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
		new org.junit.runner.JUnitCore().run(IncludeTest.class);
	}
}