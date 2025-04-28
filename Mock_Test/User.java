package Mock_Test;

public abstract class User {
	
	protected String id;
	protected String name;
	
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	abstract void showProfile();

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	} 
	
}
