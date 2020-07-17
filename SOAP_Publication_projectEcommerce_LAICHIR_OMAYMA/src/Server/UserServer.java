package Server;

import javax.xml.ws.Endpoint;

import DAO.UserDAO;

public class UserServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Endpoint.publish("http://localhost:1994/user/UserDAO", new UserDAO ());
		    System.out.println("Fait.......");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
