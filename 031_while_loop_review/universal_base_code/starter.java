import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int count = 0;
		while(true){
			Random rand = new Random();
			int xxx = rand.nextInt(100)+1;
			System.out.println(xxx);
			if(count == 100){
				System.out.println("That is a hundred numbers");
				break;
			}
			
			count = count + 1;
		}
	
		


		
	}
}
