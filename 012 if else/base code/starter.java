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
	else
	{
		System.out.print("Your number was not correct, The number was " + x);
	}
		
		
	}
}
