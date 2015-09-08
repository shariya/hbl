package test.src.forum;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.tomcat.dbcp.dbcp2.DelegatingResultSet;
import org.apache.tomcat.dbcp.dbcp2.PoolingConnection;
import org.junit.*;

import forum.DBConnectie;

import static org.junit.Assert.*;

/**
 * The class <code>DBConnectieTest</code> contains tests for the class <code>{@link DBConnectie}</code>.
 *
 * @generatedBy CodePro at 8/27/15 4:39 AM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class DBConnectieTest {
	/**
	 * Run the DBConnectie(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testDBConnectie_1()
		throws Exception {
		String DBName = "";
		String DBUser = "";
		String DBPass = "";

		DBConnectie result = new DBConnectie(DBName, DBUser, DBPass);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DBConnectie(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testDBConnectie_2()
		throws Exception {
		String DBName = "";
		String DBUser = "";
		String DBPass = "";

		DBConnectie result = new DBConnectie(DBName, DBUser, DBPass);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testClose_1()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testClose_2()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testClose_3()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void connect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testConnect_1()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);

		fixture.connect();

		// add additional test code here
	}

	/**
	 * Run the void connect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testConnect_2()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);

		fixture.connect();

		// add additional test code here
	}

	/**
	 * Run the void query(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testQuery_1()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);
		String SQLQuery = "";

		fixture.query(SQLQuery);

		// add additional test code here
	}

	/**
	 * Run the void query(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testQuery_2()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);
		String SQLQuery = "";

		fixture.query(SQLQuery);

		// add additional test code here
	}

	/**
	 * Run the void query(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testQuery_3()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);
		String SQLQuery = "";

		fixture.query(SQLQuery);

		// add additional test code here
	}

	/**
	 * Run the ResultSet selectQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testSelectQuery_1()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);
		String SQLQuery = "";

		ResultSet result = fixture.selectQuery(SQLQuery);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ResultSet selectQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/27/15 4:39 AM
	 */
	@Test
	public void testSelectQuery_2()
		throws Exception {
		DBConnectie fixture = new DBConnectie("", "", "");
		fixture.selectQuery("");
		fixture.result = DelegatingResultSet.wrapResultSet((Statement) null, (ResultSet) null);
		fixture.stmt = null;
		fixture.conn = new PoolingConnection((Connection) null);
		String SQLQuery = "";

		ResultSet result = fixture.selectQuery(SQLQuery);

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(DBConnectieTest.class);
	}
}