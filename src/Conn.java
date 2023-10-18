//this class will be used to create JDBC connection and it involves 5 major steps 
// 1. Register the driver
// 2. Create Connection
// 3. Create statement
// 4. Execute query
// 5. Close connection

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	public Conn(){
		try {
			//loading driver
			// Class.forName(com.mysql.cj.jdbc.Driver);
			//creating connection
			c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "@Bhinav0078");
			//create statement
			s = c.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
