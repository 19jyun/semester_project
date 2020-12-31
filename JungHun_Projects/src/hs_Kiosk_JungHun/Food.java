package hs_Kiosk_JungHun;

import java.io.Serializable;

public class Food implements Serializable{

	private String fname;
	private int fprice;
	private boolean[] available;
	private char type;
	private int iteration;
		
	/**
	 * @param iteration
	 */
	public Food(int iteration) {
		super();
		this.iteration = iteration;
	}
	/**
	 * @return the iteration
	 */
	public int getIteration() {
		return iteration;
	}
	/**
	 * @param iteration the iteration to set
	 */
	public void setIteration(int iteration) {
		this.iteration = iteration;
	}
	/**
	 * @param fName
	 * @param fPrice
	 * @param fDay
	 * @param type
	 */
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname
	 * @param fprice
	 * @param available
	 * @param type
	 */
	public Food(String f, int p, char type, boolean[] a, int it) {
		super();
		fname= f;
		fprice =p;
		this.type = type;
		available = a;
		iteration = it;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the fprice
	 */
	public int getFprice() {
		return fprice;
	}
	/**
	 * @param fprice the fprice to set
	 */
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	/**
	 * @return the available
	 */
	public boolean[] getAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean[] available) {
		this.available = available;
	}
	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}
}