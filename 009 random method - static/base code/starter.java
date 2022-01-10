import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a integer");
	int x = sc.nextInt();
	
	int count = 1;
	int y = x;
	int c = x;
	
	while(true){
		c = c-1;
		 y = y*(c);
	
	if((x-1) == count){
		break;
	}
		count = count+1;
	}
	System.out.println(y);
	}
}
