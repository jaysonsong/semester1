import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = 25;
	System.out.println("What is your first name");
	String name = sc.nextLine();
	
	System.out.println("What is your title ex. Slayer of Dragons");
	String title =  sc.nextLine();
	
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
	
 System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
 
 System.out.println("Strength (1-10)");
 int ii = sc.nextInt();
 if(ii > 10){
     System.out.println("Please input a smaller value. Strength (1-10):");
     ii = sc.nextInt();
 }
 else if(x<ii){
     System.out.println("Please input a smaller value. Strength (1-10):");
     ii = sc.nextInt();
 }
 
 x = x-ii;
 System.out.println("You have " + x +" skill points left");
 
 System.out.println("Dexterity (1-10)");
 int tt = sc.nextInt();
 if(tt > 10){
     System.out.println("Please input a smaller value. Dexterity (1-10):");
     tt = sc.nextInt();
 }
 else if(x<tt){
     System.out.println("Please input a smaller value. Dexterity (1-10):");
     tt = sc.nextInt();
 }
 x = x-tt;
 System.out.println("You have " + x +" skill points left");
 
 System.out.println("Intelligence (1-10)");
 int yy = sc.nextInt();
 if(yy > 10){
     System.out.println("Please input a smaller value. Intelligence (1-10):");
     yy = sc.nextInt();
 }
 else if(x<yy){
     System.out.println("Please input a smaller value. Intelligence (1-10):");
     yy = sc.nextInt();
 }
 x = x-yy;
 System.out.println("You have " + x +" skill points left");
 
 System.out.println("Constitution (1-10)");
 int qq = sc.nextInt();
 if(qq > 10){
     System.out.println("Please input a smaller value. Constitution (1-10):");
     qq = sc.nextInt();
 }
 else if(x<qq){
     System.out.println("Please input a smaller value. Constitution(1-10):");
     qq = sc.nextInt();
 }
 x = x-qq;
 System.out.println("You have " + x +" skill points left");
 
 System.out.println("Charisma (1-10)");
 int gg = sc.nextInt();
 if(gg > 10){
     System.out.println("Please input a smaller value. Charisma  (1-10):");
     gg = sc.nextInt();
 }
 else if(x<gg){
     System.out.println("Please input a smaller value. Charisma  (1-10):");
     gg = sc.nextInt();
 }
 x = x-gg;
 
 int rrr =(25-(ii+tt+yy+qq+gg));
 if(rrr>0)
{
 	System.out.println("You have "+ rrr + " for next time");
}
	
 System.out.println("You are "+ name + " The " + title + " of CVHS");
 System.out.println("You're "+ hhh + " with the following stats:");
 System.out.println("Strength:" + ii);
  System.out.println("Dexterity:" + tt);
   System.out.println("Intelligence:" + yy);
    System.out.println("Constitution:" + qq);
     System.out.println("Charisma:" + gg);
     
	}
}
