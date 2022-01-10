import java.util.Scanner;
import java.util.Random;
class character{
	String wiz = new String("Wizard");
	
	 int str = 6;
	 int dex = 5;
	 int inte = 7;
	 int con = 4;
	 int cha = 3;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character mycha = new character();
		System.out.println(mycha.wiz);
		System.out.println("Strength:" +mycha.str);
		System.out.println("Dexeterity:" +mycha.dex);
		System.out.println("Intelligence:" +mycha.inte);
		System.out.println("Constitution:"+mycha.con);
		System.out.println("Charisma:"+mycha.cha);
	


		
	}
}
