package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import DAO.UserDAO;
import DAO.User_Service;
import DAO.User_ServiceLocator;
import DAO.User_Type;

/**
 * Servlet implementation class DefineUser
 */
@WebServlet("/DefineUser")
public class DefineUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DefineUser() {
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
		
		
		String Login =request.getParameter("mailconnect");
		String Password =request.getParameter("mdpconnect");
		
       User_Service us=new User_ServiceLocator();
	    
       try {
		UserDAO port= us.getUserDAOPort();
		port.authenUser(Login, Password);
		if(u!=null) {
			if (u.getRef()==1) {
				response.sendRedirect("espace_admin.jsp");
				
			}
         
			else {
				
				//System.out.println(u.getNom());
				HttpSession ses = request.getSession();
				ses.setAttribute("nom", u.getNom());
				//ses.setAttribute("idutilisateur", u.getId());
				//ses.setAttribute("mail", u.getEmail());
				response.sendRedirect("Home.jsp");
			}
			
		}
		
	} catch (ServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
