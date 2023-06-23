package Day1;

import java.util.Scanner;

public class UserName 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a name :");
	String s = sc.nextLine();
	System.out.println("Hello "+ s +","+ " How are you?");
}
}
