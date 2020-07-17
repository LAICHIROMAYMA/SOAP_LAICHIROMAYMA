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

import DAO.UserDAO;
import DAO.User_Service;
import DAO.User_ServiceLocator;
import DAO.User_Type;


/**
 * Servlet implementation class UserView
 */
@WebServlet("/UserView")
public class UserView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserView() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
    	
    	
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	PrintWriter out=response.getWriter();
		
		UserDAO ud=null;
		User_Type[] bs=new User_Type[]{};
	    
		User_Service us=new User_ServiceLocator();
		
       out.print("<h1>Users Management</h1>");

       
       try {
		UserDAO port= us.getUserDAOPort();
		bs=port.getAllUsers();
	} catch (ServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
       
		out.print("<table width='60%' bgcolor='gold' biorder='2px'>");
		out.print("<thead><tr><th>ID</th><th>Reference</th><th>User Name</th><th>User Email</th><th>Password</th></tr></thead>");
		out.print("<tbody>");
		for (User_Type u : bs) {
			out.print("<tr>");
			out.print("<td>"+u.getId()+"</td>");
			out.print("<td>"+u.getRef()+"</td>");
			out.print("<td>"+u.getNom()+"</td>");
			out.print("<td>"+u.getEmail()+"</td>");
			out.print("<td>"+u.getPassword()+"</td>");
		
			
			out.print("<td><a href='DeleteUser?id="+u.getId()+"'>delete</a></td>");
			
		}
		out.print("</tbody>");
		out.print("</table");
		
		
	}
}
