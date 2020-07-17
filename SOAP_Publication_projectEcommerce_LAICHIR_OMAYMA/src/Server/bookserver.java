package Server;

import javax.xml.ws.Endpoint;

import DAO.BookDAO;


public class bookserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		try {
			Endpoint.publish("http://localhost:1991/booksclient/BookDAO", new BookDAO ());
		    System.out.println("Fait.......");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
