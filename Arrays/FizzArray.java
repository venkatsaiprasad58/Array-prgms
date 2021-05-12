package ojas;

import java.util.Scanner;

public class FizzArray 
{
	public static int[] fizzArray(int start, int end)
	{
		int count = 0;
		int[] fizzArray = new int[end - start];
	    for (int index = start; index < end; index++)
	    {
	       fizzArray[count] = index;
	       count++;
	    }
	    return fizzArray;
	   
	}
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Start Value: ");
	    int start = sc.nextInt();
	    System.out.println("Enter end value: ");
	    int end = sc.nextInt();
	    int[] fizzArray = fizzArray(start, end);
	    for (int index : fizzArray) 
	    {
	    	System.out.print(index + " ");
			
		}
	    sc.close();
	}

}

