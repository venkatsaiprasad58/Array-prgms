package ojas;

import java.util.Scanner;

public class ArrayWithoutTen 
{
	public static int[] withoutTen(int[] givenArray)
	{
		int[] array = new int[givenArray.length];
		int count = 0;
		for (int index = 0; index < givenArray.length; index++) 
		{
			if(givenArray[index] != 10)
			{
				array[count] = givenArray[index];
				count++;
			}
		}
		return array;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Enter "+ arraySize + " valus in array: ");
		for (int index = 0; index < array.length; index++) 
		{
			array[index] = sc.nextInt();
		}
		int[] rasultArray = withoutTen(array);
		for (int index : rasultArray) 
		{
			System.out.print(index + " ");
		}
		sc.close();
		
	}

}
