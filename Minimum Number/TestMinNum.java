package ojas;

import java.util.Scanner;


public class TestMinNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array 10: ");
		int arraySize = sc.nextInt();
		
		
		System.out.println("Enter the  values: ");
		int[] array = new int[arraySize];
		for (int index = 0; index < 10; index++) 
		{
			array[index] = sc.nextInt();
		}
		int min = MinNumber.getMin(array);
		System.out.println(min);
		sc.close();
		
	}

}