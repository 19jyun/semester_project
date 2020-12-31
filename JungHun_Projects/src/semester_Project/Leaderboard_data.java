package semester_Project;

import java.io.Serializable;

public class Leaderboard_data implements Serializable{

	/**
	 * @param name
	 * @param time
	 */
	public Leaderboard_data(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}
	private String name;
	private int time;
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
	 * @return the time
	 */
	public int getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}
	
}
