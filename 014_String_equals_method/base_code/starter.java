import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		
	String sss = new String("Wizard");
	String ccc = new String("Warrior");
	String ddd = new String("Rogue");
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
	String hhh = sc.nextLine();


	
	if(hhh.equals("Wizard"))
	{
		System.out.println("You've chosen the Wizard! Excelsior!");
	}
	else if(hhh.equals("Warrior"))
	{
		System.out.println("You've chosen the Warrior! For honor!");
	}
	else if(hhh.equals("Rogue"))
	{
		System.out.println("You've chosen the Rogue! How cunning!");
	}
	else
	{
		System.out.println("You've decided not to chose a role. Rerun program.");
	}
	}
}
