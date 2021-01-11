package com.stack;

public class Stack {

	public static void main(String[] args) 
	{
		Methods obj = new Methods();
		
		obj.push(5);
		obj.push(2);
		obj.push(1);
		obj.push(10);
		obj.push(55);
		
		obj.show();
		
		int max = obj.findMax();
		System.out.println("Maximum element is: " + max);
		
		int min = obj.findMin();
		System.out.println("Minimum element is: " + min);

	}
	
	

}
