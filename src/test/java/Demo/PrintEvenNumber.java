package Demo;

import org.testng.annotations.Test;

public class PrintEvenNumber {

	@Test
	public void PrimeNum()
	{
	int num = 17, count = 0;
	
	for(int i =1;i<=17;i++)
	{
		if(num%i == 0)
		{
			count++;
		}
	}
	if(count ==2)
	{
		System.out.println(num + " is a prime number");
	}
	}
}
