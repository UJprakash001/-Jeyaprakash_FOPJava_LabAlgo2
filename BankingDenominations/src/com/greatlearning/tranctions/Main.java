package com.greatlearning.tranctions;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Deniminations:");
		int size = sc.nextInt();
		int [] count = new int[size];
		int [] array =new int[size];
		System.out.println("Enter the Currency Deniminations:");
		for(int i=0; i < size ; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("How Much You Want To Pay:");
		int amountPayble = sc.nextInt();
		System.out.println("Your Payment approch will me No Notes:");
		
		for(int i=0;i<size;i++) {
			if(amountPayble >= array[i]) {
				count[i] = amountPayble/array[i];
				amountPayble = amountPayble - count[i]*array[i];
			}
			}
			for(int j=0; j<size; j++) {
				System.out.println(array[j] + ":"+ count[j]);
	}
		
		
	}

}