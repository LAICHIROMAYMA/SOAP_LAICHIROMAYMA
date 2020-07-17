package Beans;

public class User {

	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @param ref
	 * @param nom
	 * @param email
	 * @param password
	 */
	public User(int ref, String nom, String email, String password) {
		super();
		this.ref = ref;
		Nom = nom;
		this.email = email;
		this.password = password;
	}
	/**
	 * @param id
	 * @param ref
	 * @param nom
	 * @param email
	 * @param password
	 */
	public User(int id, int ref, String nom, String email, String password) {
		super();
		this.id = id;
		this.ref = ref;
		Nom = nom;
		this.email = email;
		this.password = password;
	}
	private int id;
	private int ref;
	private String Nom;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
