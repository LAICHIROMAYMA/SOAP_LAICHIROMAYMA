package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import DAO.UserDAO;
import DAO.User_Service;
import DAO.User_ServiceLocator;
import DAO.User_Type;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddClient
 */
@WebServlet("/AddClient")
public class AddClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClient() {
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
		User_Type u= new User_Type();
		UserDAO ud=null;
		
		String nom=request.getParameter("nom");
		String Email= request.getParameter("mail");
		String password =request.getParameter("mdp");
		
		u.setRef(2);
		u.setNom(nom);
		u.setEmail(Email);
		u.setPassword(password);
		
		User_Service us=new User_ServiceLocator();
		
		try {
			UserDAO port= us.getUserDAOPort();
			port.adduser(u);
			out.println("ADD with success");
			response.sendRedirect("Home.jsp");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(u!=null) {
			if(u.getRef()==2)
			{
				HttpSession ses = request.getSession();
				ses.setAttribute("nom", u.getNom());
				ses.setAttribute("Email", u.getEmail());
				ses.setAttribute("password", u.getPassword());
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
