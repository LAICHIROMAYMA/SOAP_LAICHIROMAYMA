package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import DAO.Book;
import DAO.BookDAO;
import DAO.BooksLocator;
import DAO.CatLocator;
import DAO.Category;
import DAO.CategoryDAO;

/**
 * Servlet implementation class addbook
 */
@WebServlet("/addbook")
public class addbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addbook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		Book b =new Book();
		Category c=new Category();
		
		int id_category=Integer.parseInt(request.getParameter("type"));
		String Writer=request.getParameter("writer");
		String Name= request.getParameter("title");
		String Image =request.getParameter("image");
		String Summary =request.getParameter("description");
		double Price=Double.parseDouble(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		String avail=request.getParameter("avail");
		
		c.setId_category(id_category);
		b.setBook_category(c);
		b.setAutor_name(Writer);
		
		b.setBook_name(Name);
		b.setBook_image(Image);
		b.setBook_Summary(Summary);
		b.setBook_price(Price);
		b.setBook_Quantity(quantity);
		b.setBooks_availibility(avail);
		
		BooksLocator bsl=new BooksLocator();
		try {
		BookDAO port= bsl.getBookDAOPort();
        port.addBook(b);
		//out.println("ADD with success");
		
		}catch(ServiceException e) {
			e.printStackTrace();
			
		}
		
		response.sendRedirect("ViewAllbook.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
