/**
 * 
 */
package com.dhaval.general;

/**
 * @author Dhaval Simaria
 *
 */
public class UBS {

	static String str;
	public void UBS() {
		System.out.println("Inside the constructor");
		str = "Hello WOrld";
	}
	public static void main(String[] args) {
		UBS ubs  = new UBS();
		System.out.println(str);

	}

}
