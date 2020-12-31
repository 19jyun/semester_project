package summatives;

public class Event_JungHun {
	
	/**
	*@author 19jyun
	*@date January 19
	*@purpose summative project: ArrayList
	*/

	String name;
	String time;
	int nop;//number of participants
	/**
	 * @param name
	 * @param time
	 * @param nop
	 */
	public Event_JungHun(String name, String time, int nop) {
		super();
		this.name = name;
		this.time = time;
		this.nop = nop;
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
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the nop
	 */
	public int getNop() {
		return nop;
	}
	/**
	 * @param nop the nop to set
	 */
	public void setNop(int nop) {
		this.nop = nop;
	}
	
}
