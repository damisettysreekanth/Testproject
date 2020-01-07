
package Practiceproject.Practiceproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderwithtestng {
	@DataProvider(name = "mydataprovider")
	public Object[][] mydata() {

		Object[][] obj = new Object[2][2];
		obj[0][0] = "user1";
		obj[0][1] = "pswd1";
		obj[1][0] = "user2";
		obj[1][1] = "pswd2";
		return obj;

	}

	@Test(dataProvider = "mydataprovider")
	public void test(String username, String pswrd) {
		System.out.println("username is" + username);
		System.out.println("password is" + pswrd);
	}
	public void dataBaseconncetion() throws Exception, Exception, Exception {
		//register the driver
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		//create the connection
		Connection con= DriverManager.getConnection(""," "," " );
		 //create statement
		Statement stmt=con.createStatement();
		//executing query
		ResultSet rs=stmt.executeQuery("");
		//closing the connection
		con.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
