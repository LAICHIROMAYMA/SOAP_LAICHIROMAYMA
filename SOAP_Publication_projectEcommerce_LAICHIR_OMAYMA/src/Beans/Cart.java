package Beans;

public class Cart {

	/**
	 * 
	 */
	public Cart() {
		super();
	}
	/**
	 * @param image_book
	 * @param name_book
	 * @param price_book
	 */
	public Cart(String image_book, String name_book, double price_book) {
		super();
		Image_book = image_book;
		Name_book = name_book;
		Price_book = price_book;
	}
	/**
	 * @param id_Cart
	 * @param image_book
	 * @param name_book
	 * @param price_book
	 */
	public Cart(int id_Cart, String image_book, String name_book, double price_book) {
		super();
		this.id_Cart = id_Cart;
		Image_book = image_book;
		Name_book = name_book;
		Price_book = price_book;
	}
	private int id_Cart;
	private String Image_book;
	private String Name_book;
	private double Price_book;
	public int getId_Cart() {
		return id_Cart;
	}
	public void setId_Cart(int id_Cart) {
		this.id_Cart = id_Cart;
	}
	public String getImage_book() {
		return Image_book;
	}
	public void setImage_book(String image_book) {
		Image_book = image_book;
	}
	public String getName_book() {
		return Name_book;
	}
	public void setName_book(String name_book) {
		Name_book = name_book;
	}
	public double getPrice_book() {
		return Price_book;
	}
	public void setPrice_book(double price_book) {
		Price_book = price_book;
	}
	
	
}
