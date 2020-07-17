package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Beans.Book;
import Beans.Cart;
import Beans.User;
import DB.connection;

@WebService(serviceName="cart")
public class CartDAO {

	
	private Statement st ;
    private connection conx ;
    private ResultSet rs ;
    
    public CartDAO() 
     {
    	conx=new connection();
    	st=conx.getStatement();
    }
    @WebMethod(operationName="addcartbook")
    public void AddCartbybook(@WebParam(name="b")Book b)
    {
    	try {
			st.executeUpdate("insert into cart (Image_book,Name_book,Price_book) values ('"+b.getBook_image()+"','"+b.getBook_name()+"','"+b.getBook_price()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod(operationName="addcart")
    public void AddCart(@WebParam(name="image")String image_book,@WebParam(name="nom")String name_book,@WebParam(name="price")double price_book)
    {
    	try {
			st.executeUpdate("insert into cart (Image_book,Name_book,Price_book) values('"+image_book+"','"+name_book+"','"+price_book+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    @WebMethod(operationName="getcart")
    public ArrayList<Cart> GetCartByUser()
    {
    	try {
			rs=st.executeQuery("select * from cart ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	ArrayList<Cart> cs=new ArrayList<>();
    	try {
			while(rs.next()) {
			  Cart c =new Cart();
			   c.setId_Cart(rs.getInt(1));
			   
			   c.setImage_book(rs.getString(3));
			   c.setName_book(rs.getString(4));
			   c.setPrice_book(rs.getDouble(5));
			   cs.add(c) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return cs;
    	
    }
    @WebMethod(operationName="deletefromcat")
    public void DeleteFromCart(@WebParam(name="id")int id_cart)
    {
    	try {
			st.executeUpdate("Delete from cart where id_cart="+id_cart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

}
