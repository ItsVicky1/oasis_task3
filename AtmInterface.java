package com.task3;
import java.util.Scanner;

/**
 * @author VIKAS
 *
 *this class repesent the ATM interface how it work
 *
 */
public class AtmInterface {

	public static void main(String[] args) {

		int ids=1234;
		int passs=4444;
		int i=0;
		
		IdPass obj=new IdPass();
		ActionPerf obj2=new ActionPerf();		
		Scanner scan=new Scanner(System.in);
		
		int id=obj.id();
		int pass=obj.pass();
		
		
			  if(ids!=id )
		        {
		            while(true)
		            {
		                i++;
		            System.out.println("Wrong pin Number!! ");
		            System.out.println("Please Re-enter your pin (Max. Attempts :- 3) : ");
		            id=obj.id();
		            if(ids==id)
		            {
		                break;
		            }
		            if(i==3){
		                //user will get 3 maximum attempts to re-enter the pin number
		                System.out.println("You have exceeded your trials !! Retry After some time !");
		            System.exit(0);
		            }
		            }
		        }else {
		        	
		        	obj2.action();
		        }
			
			  
			  
		
		
		
	}
	
}
