package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {

	private Connection cnx;
    private Statement st;
    String username = "root";
    String password = null;
    private String url="jdbc:mysql://localhost:3306/bookshop";
    
    public connection() 
    {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
    try {
		cnx = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		st = cnx.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    }
    
    public Statement getStatement()
    {
    return st;
    }
	
}
