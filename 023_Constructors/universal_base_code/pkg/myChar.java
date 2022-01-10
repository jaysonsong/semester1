package pkg;
import java.util.Scanner;
import java.util.Random;


public class myChar{
	public String role;
	public myChar () {
		role = "No role";
	}


	public myChar(String hhh) {
		role = hhh;
		if(role.equals("Wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Warrior"))	{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Rogue"))	{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else {
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		
		
	}

}

