import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
		vdollars = 100;
		jackpot = wage * 3;
		twosame = wage *2;
		answe = yes;
		answer = no;
		while(true){
			System.out.println("How much would you like to wager");
			int wage = sc.nextInt();
			vdollars = vdollars - wage;
			int num1 = rand.nextInt(100)+1;
			int num2 = rand.nextInt(100)+1;
			int num3 = rand.nextInt(100)+1;
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			
			if(num1 == num2 && num2 == num3){
				vdollars = vdollars + jackpot;
				System.out.println("You won jackpot!!! You have recieved 3 times your wager");
				
			}
			else if(num1 == num2 && num2 != num3){
				vdollars = vdollars + twosame;
				System.out.printl("two are the same!!! You get double your wage");
			}
			else{
				System.out.println("You won nothing");
			}
			System.out.println("Would you like to play again (yes or no)");
			String ggg = sc.nextLine();
				if(ggg.equals(no)){
					break;
				}
			
			
		}
		

		
	}
}
