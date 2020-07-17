package Server;

import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import DAO.CategoryDAO;

public class CategoryServer {

	public static void main(String[] args) {
		
		try {
			Endpoint.publish("http://localhost:1998/DAO/CategoryDAO", new CategoryDAO ());
		    System.out.println("Fait.......");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
}
