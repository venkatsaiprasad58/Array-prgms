import java.util.Scanner;

public class TestOccurrenceCounter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int arraysize = sc.nextInt();
		int[] array = new int[arraysize];
		System.out.println("Enter the values");
		for(int i =0;i < array.length;i++)
		{
			array[i] = sc.nextInt();
			
		}
		System.out.println("enter the number to count");
		int number = sc.nextInt();
		int count = OccurrenceCounter.getOccurrenceCounter(array,number);
		System.out.println(count);

	}

}
