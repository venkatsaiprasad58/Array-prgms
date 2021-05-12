package ojas;

import java.util.Scanner;

public class Test 
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
		System.out.println("Result is : ");
		int maxNumber = MaxNumber.getMax(array);
		System.out.println(maxNumber);
		sc.close();
		
	}

}

