import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats is your name?");
		String Firstname = sc.nextLine();
		
		System.out.println("Whats is your age?");
		int Age = sc.nextInt();
		
		System.out.println("Whats is your Birthday month? (1-12)");
		int Month = sc.nextInt();
		
		System.out.println("What day were you born? (1-31)");
		int day = sc.nextInt();
		
		System.out.println("Whats is your Birthday year?");
		int year = sc.nextInt();
		
		System.out.println("If I have a dollar and two quarters, how much money do I have?");
		double buck = sc.nextDouble();
	
	System.out.println("Your name is " + Firstname + " and you were born on " + Month + "/" + day + "/" + year);
	System.out.println("you are " + Age + " years old!!!");
	System.out.println("You have $" + buck + " in your wallet");
	
	

	}
}
