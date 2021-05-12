import java.util.Scanner;


public class TestFillMultipies 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number greater than zero: ");
		int number = sc.nextInt();
		int[] multiples = FillMultiples.getMultiples(number);
		if(multiples == null)
		{
			System.out.println("Null");
		}
		else
		{
			for (int index : multiples) 
			{
				System.out.print(index + "  ");
			}
		}
		sc.close();

	}

}
