import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Please input your first number");
	int number1 = sc.nextInt();
	
	System.out.println("Please input your second number");
	int number2 = sc.nextInt();
	
	boolean x = number1!=number2;
		if(x)
	{
		
		System.out.println("The numbers are different");
	}
	if(number1==number2)
	{
		System.out.println("You numbers are the same");
	}
	}
}
