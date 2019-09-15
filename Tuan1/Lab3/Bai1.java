package Lab3;

import java.util.Scanner;

public class Bai1 {
	public static void main (String [] args)
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("Vui lòng nhập số của bạn:");
		double number = Sc.nextDouble();
		boolean ok = true;
		for(int i=2;i<number -1;i++)
		{
			if(number % i == 0)
			{
				ok = false;
				break;
			} i++;
		}
	}

}
