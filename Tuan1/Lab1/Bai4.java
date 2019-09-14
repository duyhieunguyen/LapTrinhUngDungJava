package Lab1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		float x,x1,x2;
		float delta;
		System.out.println("Nhập a, b, c của bạn:");
		Scanner Sc = new Scanner(System.in);
		float a= Sc.nextFloat();
		float b = Sc.nextFloat();
		float c = Sc.nextFloat();
		delta = (float) (Math.pow(b,2) - 4*a*c);
		System.out.println("Delta của bạn:" +delta);
		

	}

}
