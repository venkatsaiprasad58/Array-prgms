package ojas;

import java.util.Scanner;
import ojas.OddCount;

public class TestOddCount 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array more than 10: ");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Enter the " + arraySize + "  values: ");
		for (int index = 0; index < array.length; index++) 
		{
			array[index] = scanner.nextInt();
		}
		int count = OddCount.getOddCount(array);
		System.out.println(count);
		scanner.close();
	}

}
