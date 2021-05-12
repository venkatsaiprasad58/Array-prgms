
public class OccurrenceCounter 
{
	public static int getOccurrenceCounter(int[] inputArray, int givenNumber)
	{
		int count = 0;
		int i;
			for( i =0;i < inputArray.length;i++) 
			{
				if(inputArray[i] == givenNumber)
				{
					count++;
				}
			}
			if(count == 0)
			{
				return -1;
			}
		return count;
	}
}
