import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random() ;
		int x = rand.nextInt(999)+1;
		
		
		System.out.println("Guess a number from 1-1000:");
		int y = sc.nextInt();
		
		if(x==y)
	{
	System.out.println("your number was right Congratualtions");
	}
	else if(x>y)
	{
		System.out.println("The number is larger than your number");
	}
	else
	{
		System.out.println("Your number is smaller than your number");
	}
		System.out.println("The number was " + x);
	}
}
