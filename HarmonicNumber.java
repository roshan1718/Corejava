package BasicCore;

import java.util.Scanner;

public class HarmonicNumber
{
	public static double harmonicValue(double n)
	{
	
        double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		val = val + (1.0/i);
		}
	return val;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	   	System.out.println("Enter a number: ");
		double n=sc.nextDouble();
    	double result=harmonicValue(n);
		
		if(n>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	
}


}
