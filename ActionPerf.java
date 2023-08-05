package com.task3;
import java.util.Scanner;
public class ActionPerf extends Operation{

	public void action() {
		
		System.out.println("which action you have to perform");
		System.out.println("1.Trasaction History\n 2.Withdraw\n 3.Deposite\n 4.Transfer\n 5.Quit");
		System.out.println("just enter a your choice ");
		Scanner obj=new Scanner(System.in);
		
		int i=obj.nextInt();
		switch(i) {
		
		case 1: trasHis();
		         break;
		         
		case 2: withdraw();
	             break;
	             
		case 3: depostie();
		         break;
		         
		case 4: transfer();
		         break;
		         
		case 5: 
			System.exit(0)
		;
		
		}
 	}  
	
}
