import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc = new Scanner(System.in);
	
	Random rand = new Random();
	int rand_num = rand.nextInt(1000)+1;
	System.out.println(rand_num);
	System.out.println("Guess the number from 0-1000");
	int ggg = sc.nextInt();
	if(ggg == rand_num){
		System.out.println("Congratualtions you won");
	}
	else if(ggg != rand_num)
	{
	while(true){
		System.out.println("Guess a different number: ");
		ggg = sc.nextInt();
		if(ggg == rand_num) {
			System.out.println("Congratualtions you won");
			break;
			}
		}
	}
	}
}
