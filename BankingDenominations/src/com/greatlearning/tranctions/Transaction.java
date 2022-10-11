package com.greatlearning.tranctions;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTrans, target;
		System.out.println("Enter the number of transactions :");
		noOfTrans = sc.nextInt();
		
		int [] transArray = new int [noOfTrans];
		
		System.out.println("Enter the transaction:");
		
		for (int i =0; i < noOfTrans; i++)
			
		{
			transArray[i] = sc.nextInt();
			
		}
		System.out.println("what is the target needed to be achived?");
		target = sc.nextInt();
		
		int checkvar = 0;
		int idk = 1;
		boolean checkno = false;
		{
		 for (int i =0; i < noOfTrans; i++)
		 {
			  checkvar += transArray[i];
			  idk += i;
			  if (checkvar <target)
			  {
				  checkno = true;
				  break;
			  }
			  
			}
		 	if (checkno == true)
		 	{
		 		System.out.println("Target is achived after " + idk +"Transactions ");
		 		
		 	}
		 	else
		 	System.out.println("Target is not achived");
		 	}
			 
	}

}
