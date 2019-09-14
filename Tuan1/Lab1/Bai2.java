package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main (String [] args)
	{
		System.out.println("Nhập 2 cạnh của bạn:");
		Scanner Sc = new Scanner (System.in);
		float edge1 = Sc.nextFloat();
		float edge2 = Sc.nextFloat();
		float perimeter= (edge1 + edge2) *2;
		float area = (edge1 * edge2);
		float edgeMin = Math.min(edge1, edge2);
		System.out.printf("Chu Vi:" +perimeter +"\nDiện Tích:" +area+"\nCạnh nhỏ nhất:"+edgeMin);
	}

}
