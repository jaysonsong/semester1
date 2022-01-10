import java.util.Scanner;
import java.util.Random;

class starter {
	public static void pownumber(int x, int y){
		int base = x;
		int exponent = y;
		int vari = x;
		
		int count = 1;
		
		while(true){
			base = base*vari;
			count = count +1;
			if(count == exponent){
				break;
			}
			
		}
		System.out.println(base);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What number do you want as your base number");
		int ggg = sc.nextInt();
		
		System.out.println("what number would you want as your power number");
		int xxx = sc.nextInt();
		
		System.out.print("Your number is ");
		pownumber(ggg,xxx);
		



		
	}
}
