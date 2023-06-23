package Day1;

import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args) 
	{
		//Taking input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int  count = 0;
		int count1 = 0;
		
		//Computation
		for(int i=0; i<num; i++)
		{
			double random = Math.random();
			
			if(random<0.5)
			{
				System.out.println("Heads");
				count++;
			}
			else
			{
				System.out.println("Tails");
				count1++;
			}
		}
		double head = (count*100)/num;
		double tail = (count1*100)/num;
		System.out.println("Percentage of heads is : "+ head +"%");
		System.out.println("Percentage of tails is : "+ tail +"%");
		
	}

}
