package com.stack;

public class Methods 
{
	int[] arry = new int[5];
	int position = 0;
	public void push(int data)
	{
		arry[position] = data;
		position++;
	}
	
	public int findMax()
	{
		int highest = arry[0];
		for(int i=1; i<arry.length; i++)
		{
			if(highest < arry[i])
					highest = arry[i];
		}
		return highest;
	}
	public int findMin()
	{
		int lowest = arry[0];
		for(int i=1; i<arry.length; i++)
		{
			if(lowest > arry[i])
					lowest = arry[i];
		}
		return lowest;
	}
	
	
	public void show()
	{
		for(int i: arry)
			System.out.print(i + " ");
		System.out.println("\n");
	}

}
