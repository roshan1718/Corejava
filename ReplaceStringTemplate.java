package BasicCore;

import java.util.Scanner;

public class ReplaceStringTemplate {

	public static void main(String[] args) {
	
		String str1, str2, str3;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter String: ");
		str1 =sc.nextLine();

		System.out.print("Enter name you want to replace: ");
		str2 =sc.nextLine();

		System.out.print("Enter name you want to replace with: ");
		str3 =sc.nextLine();
	
		if (str3.length() >= 3) {
			str1 = str1.replace("username", str3);
			System.out.println("New given string is"+str1);
		} 
		else
			System.out.println(" Ensure UserName has min 3 char at list");

	}
	

}
