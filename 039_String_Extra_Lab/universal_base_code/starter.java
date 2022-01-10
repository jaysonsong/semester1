import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase");
		String reverse = sc.nextLine();
		
		String s = "";
		
		String str[] = reverse.split(" ");
		
		for(int i = str.length-1;i>=0;i--)
		{
			s+=str[i]+" ";
		}
	System.out.println("After reverse"+s);
		
	}
}
