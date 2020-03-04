package BasicCore;

import java.util.Scanner;

public class Leapyear {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		
		int year= sc.nextInt();
		int len=(int)(Math.log10(year)+1);
	if(len==4)
		{
		
		if((year % 4 == 0 && year % 100 !=0)||year % 400==0)
		
			System.out.println(year+"  is a leap year ");
		else
			System.out.println(year+" is not a leap year");
		}
	else
		
		System.out.println("Year, ensure it is a 4 digit number.");
	}	

}
