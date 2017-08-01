package Session8_Assignment2;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
	try
		{
		 Scanner sc=new Scanner(System.in);  
	     
		   System.out.println("Thread 2:Enter the number to check");  
		   int inputNumber=sc.nextInt();  
		
		   
		   //Every number is divisible by 1, so the loop start from 2 end till half of the given 
		   //number.Bcos divisor of a number cannot be more than of half of itself.
		   for(int i=2;i<=inputNumber/2;i++)
				{
				if (inputNumber %i == 0){ //checks whether the number is divisible by anything other than 1 and itself.
				System.out.println("Thread2: Given number " +inputNumber + " is not a prime");
				return;//returns if the number is prime.
				}

		}
		   System.out.println("Thread2:Given number " +inputNumber + " is a prime");
	}
	catch(Exception e){}
	}
	}
