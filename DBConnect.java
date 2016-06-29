package EchoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;;

public class DBConnect 
{
	private String host = "???";
	private String uName = "???";
	private String uPass = "???";
	private ResultSet resultSet = null;
	private Statement statement = null;
	private String privilages;
	private Connection con;
	public DBConnect(String userN, String userP)
	{
		
		try{
			Connection con = DriverManager.getConnection(host,uName,uPass);
			connectToAndQueryDatabase(uName,uPass,userN, userP);
		}catch(SQLException err){
			JOptionPane.showMessageDialog(null, err.getMessage());
			System.exit(0);
		}
	}
	
	public String getPrivilages()
	{
		return privilages;
	}
	
	public void setPrivilages(String privilages)
	{
		this.privilages = privilages;
	}
}
