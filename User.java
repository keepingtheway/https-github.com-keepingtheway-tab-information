package day18.Zuoye.Entity;

public class User {
	private String name;
	private int id;
	private String password;
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, int id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
