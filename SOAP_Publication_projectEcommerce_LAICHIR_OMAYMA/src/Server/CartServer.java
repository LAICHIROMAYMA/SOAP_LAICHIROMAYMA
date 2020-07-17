package Server;

import javax.xml.ws.Endpoint;

import DAO.CartDAO;


public class CartServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Endpoint.publish("http://localhost:1999/cart/CartDAO", new CartDAO ());
		    System.out.println("Fait.......");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
