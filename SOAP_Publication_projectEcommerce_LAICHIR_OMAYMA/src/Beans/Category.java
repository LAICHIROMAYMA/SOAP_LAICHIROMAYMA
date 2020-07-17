package Beans;

public class Category {
           
	/**
	 * 
	 */
	public Category() {
		super();
	}
	/**
	 * @param type
	 */
	public Category(String type) {
		super();
		this.type = type;
	}
	
	private int Id_category;
    private String type;
    
	public int getId_category() {
		return Id_category;
	}
	public void setId_category(int id_category) {
		Id_category = id_category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
}
