package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Beans.Book;
import Beans.Category;
import DB.DBInteraction;
import DB.connection;

@WebService(serviceName="Books")
public class BookDAO {
	
		private Statement st=null;
	    private connection cnx=null;
	    private ResultSet rs=null;
	    
	    public BookDAO() 
	    {
	    cnx=new connection();
	    st=cnx.getStatement();
	    }
	    @WebMethod(operationName="addBook")
		public void addBook(@WebParam(name="book")Book b)  {
			
			try {
				st.executeUpdate("insert into book(Id_Category,Autor_name,Book_name,Book_image,Book_Summary,Book_price,Book_Quantity,Books_availibility)values('" +b.getBook_category().getId_category()+"','" +b.getAutor_name()+"','"+b.getBook_name()+"','"+b.getBook_image()+"','"+b.getBook_Summary()+"','"+b.getBook_price()+"','"+b.getBook_Quantity()+"','"+b.getBooks_availibility()+"')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    @WebMethod(operationName="findBook")
		public Book findBookById(@WebParam(name="id")int id) {
			Book b=null;
			 Category c=new Category();
			DBInteraction.connect();
			ResultSet rs =DBInteraction.select("select * from book where Book_id="+id);
			
	         try {
				rs.next();
			
	         c.setId_category(rs.getInt("Id_category"));
	         b.setBook_category(c);
	         b.setBook_name(rs.getString("Book_name"));
	         b.setAutor_name(rs.getString("Autor_name"));
	         b.setBook_image(rs.getString("Book_image"));
	         b.setBook_price(rs.getDouble("Book_price"));
	         b.setBook_Quantity(rs.getInt("Book_Quantity"));
	         b.setBook_Summary(rs.getString("Book_Summary"));
	         b.setBooks_availibility(rs.getString("Books_availibility"));
	         
	         } catch (SQLException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	         return b;
		}
	  
	@WebMethod(operationName="deletebook")
	public int DeleteBook(@WebParam(name="id")int id) {
			
			DBInteraction.connect();
			int nb=DBInteraction.Maj("delete from book where Book_id="+id);
			DBInteraction.disconnect();
			return nb;
			
		}
	@WebMethod
		public ArrayList<Book> allBooks(){
			ArrayList<Book>  Books=new ArrayList<Book>();
			 CategoryDAO cd=new CategoryDAO();
		     
			DBInteraction.connect();
			ResultSet rs = DBInteraction.select("select * from book ");
			try {
				while(rs.next())
				{
					 Book b=new Book();
			         Category c=new Category();
	             
			         c.setId_category(rs.getInt("Id_category"));
			         c.setType(cd.getCategoryType(rs.getInt("Id_category")));
			         b.setBook_category(c);  
			            
			          b.setBook_name(rs.getString("Book_name"));
			          b.setAutor_name(rs.getString("Autor_name"));
			          b.setBook_image(rs.getString("Book_image"));
			          b.setBook_price(rs.getDouble("Book_price"));
			          b.setBook_Quantity(rs.getInt("Book_Quantity"));
			          b.setBook_Summary(rs.getString("Book_Summary"));
			          b.setBooks_availibility(rs.getString("Books_availibility"));
					Books.add(b);	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Books;
		}
		
	@WebMethod(operationName="updatebookby")
		public int updateBook(@WebParam(name="id")int id,@WebParam(name="b") Book b) {
			DBInteraction.connect();
			int nb=DBInteraction.Maj("update Book set  Book_category='"+b.getBook_category()+"', Book_name="+b.getBook_name()+", Autor_name="+b.getAutor_name()+", Book_image="+b.getBook_image()+" , Book_Summary="+b.getBook_Summary()+", Book_price="+b.getBook_price()+", Book_Quantity="+b.getBook_Quantity()+", Books_availibility='"+b.getBooks_availibility()+"' where Book_id="+id);
			DBInteraction.disconnect();
			return nb;
		}


}
