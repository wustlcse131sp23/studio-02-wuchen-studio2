package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount: ");
		int startAmount = in.nextInt();
		
		
		System.out.println("Win limit: ");
		int winLimit = in.nextInt();
		int currentMoney = startAmount;
		while ( currentMoney<winLimit && currentMoney != 0)
		{
			double randomNum = Math.random();
			boolean win = (randomNum > 0.5);
			
			if (win)
			
			{	
				currentMoney = currentMoney+1;		
				System.out.println(currentMoney);
				
			}
			else if (!win) {
				currentMoney = currentMoney-1;	
				System.out.println(currentMoney);
				
				}
		}
		
			
		
	
		if (currentMoney == winLimit) 
		{
		System.out.println("you win");
		}	
		if (currentMoney == 0) 
		{
		System.out.println("you lose");
		
}		
}
}
		
		
	


