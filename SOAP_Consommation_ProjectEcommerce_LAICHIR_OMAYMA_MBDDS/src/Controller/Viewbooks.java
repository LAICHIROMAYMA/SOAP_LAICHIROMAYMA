package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import DAO.Book;
import DAO.BookDAO;
import DAO.BooksLocator;
import DAO.User_Type;

/**
 * Servlet implementation class Viewbooks
 */
@WebServlet("/Viewbooks")
public class Viewbooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewbooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		  Book[] bs=new Book[]{};
	      BooksLocator csd=new BooksLocator();
	      BookDAO port;
		try {
			port = csd.getBookDAOPort();
		    bs=port.allBooks();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print("<table width='60%' bgcolor='gold' biorder='2px'>");
		out.print("<thead><tr><th>ID</th><th>Reference</th><th>User Name</th><th>User Email</th><th>Password</th></tr></thead>");
		out.print("<tbody>");
		for (Book b : bs) {
			out.print("<tr>");
			out.print("<td>"+b.getBook_id()+"</td>");
			out.print("<td>"+b.getBook_image()+"</td>");
			out.print("<td>"+b.getBook_name()+"</td>");
			out.print("<td>"+b.getAutor_name()+"</td>");
			out.print("<td>"+b.getBook_Quantity()+"</td>");
			out.print("<td>"+b.getBooks_availibility()+"</td>");
			out.print("<td>"+b.getBook_Summary()+"</td>");
		
			
			out.print("<td><a href='DeleteBook?id="+b.getBook_id()+"'>delete</a></td>");
			
		}
		out.print("</tbody>");
		out.print("</table");

	}
	

}
