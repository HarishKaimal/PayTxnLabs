package com.gl.paytrans;

import java.util.Scanner;

public class PayTxn {

	private int arrSize;
	private int targetNum;
	
	public void checkPayTxn() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array ");
		arrSize = sc.nextInt();
		
		int[] txnArr = new int[arrSize];
		
		for (int i=0; i< arrSize; i++) {
			System.out.println(" Enter the value of element " +(i+1));
			txnArr[i] = sc.nextInt();
		}
		
		//printing the transaction array
		for (int i=0; i< arrSize; i++) {
			System.out.println(" The value of element " +(i+1) + " is " + txnArr[i]);
		}
		
		System.out.println("Please enter the number of targets ");
		targetNum = sc.nextInt();
		int[] targetVal = new int[targetNum];
		
		for (int j=0; j< targetNum; j++) {
			
			System.out.println(" Enter the value of target " +(j+1));
			targetVal[j] = sc.nextInt();
			
			int flag = 0;
			int sum = 0; 
			
			for (int i=0; i< arrSize; i++) {
				sum=sum+txnArr[i];
				if (sum >= targetVal[j]) {
					System.out.println(" The target has been achieved after " + (i+1) + " transactions");
					flag =1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(" Target not achieved");
			}
			
		}
		sc.close();
	}
	
}
		
		
	
	
	
	
