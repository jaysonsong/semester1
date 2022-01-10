import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void setRole(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a wizard, Warrior, or a Rouge? ");
		String choice = sc.nextLine();
		
		if(choice.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior");
	}
	else if(choice.equals("Warrior"))
	{
		System.out.println("You've chosen the Warrior! For honor!");
	}
	else if(choice.equals("Rogue"))
	{
		System.out.println("You've chosen the Rogue! How cunning!");
	}
	else
	{
		System.out.println("You've decided not to chose a role. Rerun program.");
	}
	}
public static void setStrength(){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many points would you like to use for strength ");
	int str = sc.nextInt();
	System.out.println("Strength: " + str);
	return;
}
public static void setDexerity(){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many points would you like to use for dexterity ");
	int dex = sc.nextInt();
	System.out.println("Dexterity: " + dex);
	return;
}
public static void setIntelligence(){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many points would you like to use for Intelligence ");
	int intel = sc.nextInt();
	System.out.println("intelligence: " + intel);
	return;
}
public static void setConstituition(){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many points would you like to use for Constituition ");
	int Con = sc.nextInt();
	System.out.println("Constituition: " + Con);
}
public static void setCharisma(){
	Scanner sc = new Scanner(System.in);
	System.out.println("How many points would you like to use for Charisma ");
	int cha = sc.nextInt();
	System.out.println("Charisma: " + cha);
	return;
}
public static void setAll(){
	boolean setRole = true;
	boolean setStrength = true;
	boolean setDexerity = true;
	boolean setIntelligence = true;
	boolean setConstituition = true;
	boolean setCharisma = true;
	if(setRole == true && setStrength == true && setDexerity == true && setIntelligence == true && setConstituition == true && setCharisma == true){
		System.out.println("true");
	}
}
	


	public static void main(String args[]) {
		// Your code goes below here
		
	
	
	setRole();
	setStrength();
	setDexerity();
	setIntelligence();
	setConstituition();
	setCharisma();


		
	}
}
