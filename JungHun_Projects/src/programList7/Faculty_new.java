package programList7;

public class Faculty_new {

	String name;
	int[] periods;
	/**
	 * @param name
	 * @param periods
	 */
	public Faculty_new(String name, int[] periods) {
		this.name = name;
		this.periods = periods;
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
	 * @return the periods
	 */
	public int[] getPeriods() {
		return periods;
	}
	/**
	 * @param periods the periods to set
	 */
	public void setPeriods(int[] periods) {
		this.periods = periods;
	}
}
