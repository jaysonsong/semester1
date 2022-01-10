import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] zzz = new int[1000];
		int count = 0;
		int index = 0;
		Random rand = new Random();
		while(count < zzz.length){
			
			zzz[count] = rand.nextInt(999)+1;
			if(count == zzz.length){
				System.out.println("all 1000");
				break;
			}
			count = count + 1;
			
		}
		while(index < zzz.length){
			int num = zzz[index];
			System.out.println(num);
			
				index++;
		}
		
	}
}
