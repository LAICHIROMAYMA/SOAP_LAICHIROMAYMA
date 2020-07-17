package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Beans.User;
import DB.connection;

@WebService(serviceName="user")
public class UserDAO {

	private Statement st;
    private connection cnx;
    private ResultSet rs;
    public UserDAO() 
    {
    cnx=new connection();
    st=cnx.getStatement();
    }
    @WebMethod(operationName="adduser")  
    public void ajouterUser(@WebParam(name="user")User u) 
    {
        try {
			st.executeUpdate("insert into user(ref,Nom,email,password) values('"+u.getRef()+"','"+u.getNom()+"','"+u.getEmail()+"','"+u.getPassword()+"');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod(operationName="deleteuser")
      public void supprimerUser(@WebParam(name="id")int id) 
    {
        try {
			st.executeUpdate("delete from user where id='"+id+"';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod(operationName="AuthenUser")
      public User AuthenUser(@WebParam(name="email")String email,@WebParam(name="password")String password){
    	  User u=new User();
    	  try {
			rs=st.executeQuery("select * from user where email='"+email+"'and password='"+password+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  try {
    	  if(rs.next()) {
    		  u.setId(rs.getInt(1));
    		  u.setRef(rs.getInt(2));
    		  u.setNom(rs.getString(3));
    		  u.setEmail(rs.getString(4));
    		  u.setPassword(rs.getString(5));
    	  }
    	  } catch (SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    	  return u;
    	  
      }
    @WebMethod
      public ArrayList<User> GetAllUsers() 
 	 {
 		 ArrayList<User> cs=new ArrayList<>();
 	        
 	        try {
				rs=st.executeQuery("select * from user;");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 	       try {
 	        while(rs.next())
 	        {
 	            User u=new User();
 	            u.setId(rs.getInt(1));
 	            u.setRef(rs.getInt(2));
 	            u.setNom(rs.getString(3));
 	            u.setEmail(rs.getString(4));
 	            u.setPassword(rs.getString(5));
 	        cs.add(u);
 	               
 	        }
 	      } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 	        return cs;
 	    }
      
      
    @WebMethod(operationName="getuser")

	public User GetUser(@WebParam(name="id")int id){
		User u=null;
		
			UserDAO ud=new UserDAO();
		
		try {
			rs=st.executeQuery("select * from User where id="+id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		u.setRef(rs.getInt(2));
		
		u.setNom(rs.getString(3));
		u.setEmail(rs.getString(4));
		u.setPassword(rs.getString(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	
}
