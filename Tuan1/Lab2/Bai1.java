package Lab2;

import java.util.Scanner;

public class Bai1 {
	public static void main (String [] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập a và b của bạn:");
		float a = Sc.nextFloat();
		float b = Sc.nextFloat();
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.println("Phương trình vô số nghiệm:");
			}
			else
			{
			System.out.println("Phương trình vô nghiệm");
		
			}
		}
		else
		{
			float x = -b/a;
			System.out.println("Nghiệm của bạn:" +x);
		}
	}

}
