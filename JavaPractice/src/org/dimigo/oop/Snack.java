/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Snack
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack() {
		
	}
	
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack() {
		System.out.println("이름 : " + name);
		System.out.println("제조사 : " + company);
		System.out.println("가격 : " + String.format("%d", price) + "원");
		System.out.println("개수 : " + number + "개");
	}
	
	public int calcPrice() {
		return (price*number); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
