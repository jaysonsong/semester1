import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toStringArray(double []x){
		double num = 0;
		for(int i = 0;i < x.length; i++){
			System.out.println(x[i] +  " " + i);
			
	}
}
	public static double getAverage(double []x){
		double average = 0;
		int p = 0;
		double sum = 0;
		while(p < x.length){
			sum +=x[p];
			p+= 1;
		}
		sum = sum/x.length;
		return sum;
		}
		public static double getMax(double []x){
			double max = 0;
			int v = 0;
				while(v<x.length){
				if(x[v]>max){
				max = x[v];
		}
				v++;
			
	}
			return max;
		}
		public static double getMin(double []x){
			double min = 1000;
			int g = 0;
			while(g < x.length){
				if(x[g]<min){
					min = x[g];
				}
				g++;
			}
			return min;
		}
		public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		double []zzz = new double [100];
		int counter = 0;
		while(true){
			int num2 = rand.nextInt(100)+1;
			if(counter == zzz.length){
				break;
			}
			zzz[counter] = num2;
			counter += 1;
		}
		toStringArray(zzz);
		System.out.println("Average");
		System.out.println(getAverage(zzz));
		System.out.println("max");
		System.out.println(getMax(zzz));
		System.out.println("min");
		System.out.println(getMin(zzz));
	}
	}

		
	

