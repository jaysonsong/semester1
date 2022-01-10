import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		
		
	int[] zzz = new int[101];
	int count = 0;
	int index = 0;
	Random rand = new Random();
	while(count < zzz.length){
		zzz[count] = rand.nextInt(99)+1;
		if(count == zzz.length){
			System.out.println("all 100");
			break;
			}
			count = count + 1;
			
	}
	while(index < zzz.length){
			int num = zzz[index];
			System.out.println(num);
			
				index++;
		}
		
	int min = 1000;
	int c = 0;
	while(c<zzz.length){
		if(zzz[c]<min){
			min = zzz[c];
		}
		c = c+1;
	}
	System.out.println("This is the minimum; "+min);
	
	int max = 0;
	int v = 0;
	while(v<zzz.length){
		if(zzz[v]>max){
			max = zzz[v];
		}
		v++;
	}
	
	System.out.println("This is the maximum; "+max);
	int average = 0;
	int sum = 0;
	int i = 0;
	while(i < zzz.length){
		sum = sum + zzz[i];
		if(i == 101){
			break;
		}
		average = sum/ zzz.length;
	
	i++;
}
	System.out.println("This is the average; "+average);
	System.out.print("101 values");
	}
}
