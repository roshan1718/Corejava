package BasicCore;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactorization {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number To Find Prime Factors..");
		int num=sc.nextInt();
		int j=0;
		int factors[] = new int[10];
	
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{				
				factors[j]+=i;
				j++;
			}
						
		}
		System.out.println(Arrays.toString(factors));
	
	}
}
