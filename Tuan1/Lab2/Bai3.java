package Lab2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		System.out.println("Nhập số điện của bạn:");
		Scanner Sc = new Scanner(System.in);
		float electricNumber = Sc.nextFloat();
		if(electricNumber <= 50)
		{
			float electricBill = electricNumber * 1000;
			System.out.println("Số tiền điện của bạn:"+electricBill);
		}
		else
		{
			float electricBill = (50*1000 + ((electricNumber-50)*1200));
			System.out.println("Số tiền của bạn:"+electricBill);
		}

	}

}
