package summatives;

public class Player {

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
	 * @param name
	 * @param score
	 */
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	private String name;
	private int score;
	
}
