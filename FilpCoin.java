package BasicCore;

import java.util.Scanner;

public class FilpCoin {
public static void main(String[] args) {
	

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number to filp the coin");
	int times=sc.nextInt();
	int headcnt=0,tailcnt=0;
	
	for (int i = 0; i < times; i++) {
		
		double random=Math.random();
		if (random<0.5) {
			tailcnt++;
		}
		else
			headcnt++;
	}
	
	int head_percentage=headcnt*100/times;
	int tail_percentage=tailcnt*100/times;
	
	System.out.println("tail count is "+ tailcnt +" total tail Percentage count "+ tail_percentage);
	System.out.println("head count is "+ headcnt +" total head Percentage count "+ head_percentage);
}
}