package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static void main(String [] args)
	{
		
			Scanner Sc = new Scanner (System.in);
			System.out.println("Nhập số phần tử của mảng:");
			int n = Sc.nextInt();
			double []Array =new double [n];
			System.out.println("Nhập mảng");
			for(int  i =0; i<n;i++)
			{
				System.out.printf("a[%d]\n",i);
				Array[i]= Sc.nextDouble();

			}
			System.out.println("các phần tử mảng:"+Arrays.toString(Array));
			sort (Array);
			compare (Array);
			arithmeticAverage(Array);
	}
		
		private static void sort(double[]Array)
		{
			Arrays.sort(Array);
			System.out.println("\nSắp xếp các phần tử:"+ Arrays.toString(Array));
		}
		private static void compare (double [] Array)
		{
			double min = Array[0];
			for (int i = 0; i<Array.length-1;i++)
			{
				double Min = Math.min(min, Array[i]);
				System.out.println("số bé:"+Min);
			}
		}
		private static void arithmeticAverage(double[]Array)
		{
			double total = 0, count =0;
			for(int i =0; i<Array.length;i++)
			{
				
				if(Array [i] %3 ==0)
				{
					
					total += Array[i];
					count ++;
					
				}
			}
			double arithmeticAverage= total /count;
			System.out.println("" +arithmeticAverage);
			
		}
	
	}

