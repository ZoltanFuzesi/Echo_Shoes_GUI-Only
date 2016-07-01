<<<<<<< HEAD
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
	
	public void connectToAndQueryDatabase(String username, String password,String userN, String userP) throws SQLException {
		//System.out.println("User name from login : " + userN + " Password from logim : " + userP );
	   

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT UserID, UserName, Password, Email FROM Users");
	    boolean loop = true;
	    while (rs.next()&&loop) {
	        int id = rs.getInt("UserID");
	        String Un = rs.getString("UserName");
	        String Ps = rs.getString("Password");
	        String Em = rs.getString("Email");
	        //System.out.println(id+","+Un + ","+Ps+","+Em);
	        if(Un.equalsIgnoreCase(userN)&&Ps.equalsIgnoreCase(userP))
	        {
	        	setPrivilages("Access");
	        	loop = false;
	        }
	        else
	        {
	        	setPrivilages("No Access");
	        }
	    }
	}
	


}
=======
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
>>>>>>> origin/master
