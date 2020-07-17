package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Beans.Category;
import DB.connection;

@WebService(serviceName="Cat")
public class CategoryDAO {

	private Statement st=null;
    private connection cnx=null;
    private ResultSet rs=null;
       
      public CategoryDAO() 
    {
    	  
 
		cnx=new connection();
	
        st=cnx.getStatement();
    }
	
    @WebMethod(operationName="getcategoryType")
	public String getCategoryType(@WebParam(name="id")int id){
    	String ls=null;
		try {
			rs=st.executeQuery("select type from category where Id_category="+id+";");
			
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				ls= rs.getString(1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ls;
		
	}
	
	@WebMethod(operationName="Addcategory")
	 public void AddCategory(@WebParam(name="type")String type) 
	    {
	        try {
				st.executeUpdate("insert into category(type) values('"+type+"');");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	@WebMethod(operationName="AjouterCategory")
	 public void AjouterCategory(@WebParam(name="category")Category c)
	 {
		 try {
			st.executeUpdate("insert into category(type) values('"+c.getType()+"');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	@WebMethod(operationName="updatecategory")
	 public void updateCategory(@WebParam(name="id")int id ,@WebParam(name="type")String type){
		 try {
			st.executeUpdate("update category set type='"+type+"' where Id_category="+id+";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	@WebMethod(operationName="deletecategory")
	 public void DeleteCategory(@WebParam(name="id")int id){
		 try {
			st.executeUpdate("delete from Category where Id_category="+id+";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	@WebMethod
	 public ArrayList<Category> GetCategory() 
	 {
		 ArrayList<Category> cs=new ArrayList<>();
	        
	        try {
				rs=st.executeQuery("select * from category;");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        try {
				while(rs.next())
				{
				    Category c=new Category();
				    c.setId_category(rs.getInt(1));
				    c.setType(rs.getString(2));
				cs.add(c);
				       
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return cs;
	    }
	
}
