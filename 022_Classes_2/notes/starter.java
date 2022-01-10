import java.util.Scanner;
import java.util.Random;

class starter{
	public static void toString(String something){
		System.out.println(something);
		return;
	}
	public static void toStringcombined(String something, String something1){
	System.out.println(something + something1);
	return;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence");
		String xxx = sc.nextLine();
		
		System.out.println("Write a sentence");
		String ccc = sc.nextLine();
		
		System.out.println("This is using methods");
		toString(xxx);
		toStringcombined(xxx, ccc);
		
	}
	
}