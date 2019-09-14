package Lab1;

import java.util.Scanner;

public class Bai1 {
	public static void main (String [] args)
	{
		Scanner Sc = new Scanner(System.in);
		String name;
		double score;
		System.out.println("Vui lòng nhập họ và tên của bạn:");
		name = Sc.nextLine();
		 
		System.out.println("Nhập điểm của bạn:");
		score = Sc.nextDouble();
		System.out.printf("%s %f điểm" ,name ,score);
	}

}
