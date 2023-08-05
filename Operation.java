package com.task3;

import java.util.Scanner;

/**
 * @author VIKAS
 *it can perform the operation
 */
public class Operation {
	int balance = 40000, withdraw, deposit;
	Scanner scan=new Scanner(System.in);
	
	public void trasHis() {
		
		System.out.println("transfor history :");
		System.out.println("1.2000 \n 2.3000 \n 3.9000");
		balance=balance-withdraw;
		System.out.println("avalable balance"+balance);
		
	}
	
	public void withdraw() {
		
        System.out.println("Enter amount you want to Withdraw : ");
        withdraw=scan.nextInt();
        //checking if balance is less than withdrawal amount or is it zero!
        if(withdraw>balance||balance==0)
        {
            System.out.printf("You have insufficient balance!!\n");
           
        }else {
        System.out.println("Hope you collected your amount!");
        balance=balance-withdraw;
        System.out.println("avalable balance"+balance);
        }
        
	}
	
	public void depostie() {
		
		System.out.print("Enter money to be deposited: ");
        deposit = scan.nextInt();
        balance = balance + deposit;
        System.out.println("Your Money has been successfully deposited");
        System.out.println(" ");
	}
	
	public void transfer() {
		
		System.out.println("enter a tranfser amount:");
		System.out.println("enter a id of transerable bank: ");
		System.out.println("amount transfer successfully");
	}
}
