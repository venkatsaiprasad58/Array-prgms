package ojas;

import java.util.Scanner;

public class CountEven 
{
	
	
	public static int countEven(int[] array)
	{
	    int count = 0;
	    for (int index = 0; index < array.length; index++)
	    {
	        if(array[index] % 2 == 0)
	        {
	            count++;
	        }
	       
	    }
	    return count;
	   
	}
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter array size: ");
	    int arraySize = sc.nextInt();
	    int[] array =  new int[arraySize];
	    for (int index = 0; index < array.length; index++)
	    {
	        System.out.print("Enter number :");
	        array[index] = sc.nextInt();
	       
	    }
	    int count = countEven(array);
	    System.out.println(count);
	    sc.close();
	}
}