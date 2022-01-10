import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);

System.out.println("Enter your name");
String name = sc.nextLine();

System.out.println("How many times would you like your name to be repeated?");
int number = sc.nextInt();

int aaa = 0;	
while (number>aaa)
{
	System.out.println(name);
	if(aaa == number)
	{
		break;
	}
aaa = aaa + 1;
}
	}
	
}
