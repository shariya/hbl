package forum;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnectie{
	
	public String DBName, DBUser, DBPass, SQLQuery;
    public Connection conn;
    public Statement stmt;
    public ResultSet result;	
	
	public DBConnectie(String DBName, String DBUser, String DBPass){
    	this.DBName = DBName;
        this.DBUser = DBUser;
        this.DBPass = DBPass;
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
        	e.printStackTrace();
        }
    }	
	
	public void connect() {
    	try {
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DBName + "?user=" + DBUser + "&password=" + DBPass);
        }catch(Exception e){
        	e.printStackTrace();
        }
    }
	
    public ResultSet selectQuery(String SQLQuery){
    	this.SQLQuery = SQLQuery;

        try {
        	stmt = conn.createStatement();
            result = stmt.executeQuery( SQLQuery );
        }
        catch( Exception e ){}
    	return result;
    }
    
    public void query(String SQLQuery){
    	this.SQLQuery = SQLQuery;
        try {
        	stmt = conn.createStatement();
            stmt.execute( SQLQuery );
        }
        catch( Exception e ){
        	e.printStackTrace();
        }
    }
    
    public void close(){
    	try {
        	stmt.close();
            conn.close();
        }
        catch(Exception e){}
    }
}

