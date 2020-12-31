package hs_Kiosk_JungHun;

import java.io.Serializable;

public class Student implements Serializable{
	
	private String name;
	private int spentMoney;
	/**
	 * @return the name
	 */
	public String getname() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setname(String name) {
		this.name = name;
	}
	/**
	 * @return the spentMoney
	 */
	public int getspentMoney() {
		return spentMoney;
	}
	/**
	 * @param spentMoney the spentMoney to set
	 */
	public void setspentMoney(int spentMoney) {
		this.spentMoney = spentMoney;
	}
	/**
	 * @param name
	 * @param spentMoney
	 */
	public Student(String name, int spentMoney) {
		super();
		this.name = name;
		this.spentMoney = spentMoney;
	}

		




}
