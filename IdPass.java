package com.task3;
import java.util.Scanner;


/**
 * @author VIKAS
 *
 *
 *in this class
 */
/**
 * @author VIKAS
 *
 */
public class IdPass {

	
	/**
	 * @return
	 * 
	 * this method create for to get password
	 */
	public int pass(){           
		
		
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Please enter your pin number: ");
	        int pass=sc.nextInt();
			return pass;
		
		
	}
	
	
	/**
	 * @return
	 * 
	 * this method for id 
	 */
	public int id() {
		
		
		System.out.println("enter a your id to login");
		Scanner scan=new Scanner(System.in);
		int passs=scan.nextInt();
		return passs;
		
	}
}
