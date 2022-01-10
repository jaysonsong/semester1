package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexeterity;
	int intelligence;
	int constitution;
	int charisma;

	public myCharacter() {
		role = "rogue";
		strength = 0;
		dexeterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
		System.out.println("your role is"+ role);
		System.out.println("Your strength is"+ dexterity);
		System.out.println("Your dexterity is"+ intelligence);
		System.out.println("your intelligenceis"+ constitution);
		System.out.println("Your charisma is"+ charisma);
	}

}

