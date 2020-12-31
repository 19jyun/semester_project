package programList7;

public class Staff {

	String name;
	int Id;
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
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param name
	 * @param id
	 */
	public Staff(String name, int ID) {
		super();
		this.name = name;
		this.Id = Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int Id) {
		this.Id = Id;
	}
	
}
