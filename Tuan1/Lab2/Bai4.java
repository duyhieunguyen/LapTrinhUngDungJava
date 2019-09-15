package Lab2;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		System.out.println("Nhập 1 nếu bạn muốn 'Giải phương trình bậc 1'\nNhập 2 nếu bạn muốn 'Giải phương trình bậc 2'\nNhập 3 nếu bạn muốn 'Tính tiền điện'\nNhập 4 nếu bạn muốn 'Thoát'");
		int number=0;
		Scanner Sc= new Scanner(System.in);
		number = Sc.nextInt();
			switch(number)
			{
			case 1:
			{
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
			break;
			}
			case 2:
			{
				float x,x1,x2;
				float delta;
				System.out.println("Nhập a, b, c của bạn:");
				float a= Sc.nextFloat();
				float b = Sc.nextFloat();
				float c = Sc.nextFloat();
				delta = (float) (Math.pow(b,2) - 4*a*c);
				if (a ==0)
				{
					if (b ==0)
					{
						System.out.println("Phương trình vô nghiệm.");
					}
					else
					{
					x= -b/c;
					System.out.println("Phương trình có 1 nghiệm:"+x);
					}
				
				}
				else
				{
					if(delta >0)
					{
					x1 = (float)((-b-Math.sqrt(delta))/2*a);
					x2 = (float)((-b+Math.sqrt(delta))/2*a);
					System.out.println("Phương trình có 2 nghiệm kép:\nx1:" +x1 +"\nx2:" +x2);
					}
					else if(delta ==0)
					{
						x1 = x2 = (-b/2*a);
						System.out.println("Nghiệm phương trình:" +x1);
					}
					else 
					{
						System.out.println("Phương trình vô nghiệm.");
					}
				}
			break;
			}
			case 3:
			{
				System.out.println("Nhập số điện của bạn:");
				float numberDien = Sc.nextFloat();
				if(numberDien <= 50)
				{
					float tienDien = numberDien * 1000;
					System.out.println("Số tiền điện của bạn:"+tienDien);
				}
				else
				{
					float tienDien = (50*1000 + ((numberDien-50)*1200));
					System.out.println("Số tiền của bạn:"+tienDien);
				}
				break;
			}
			case 4:
				System.out.println("Bạn đã thoát.");
				break;
				
			}

	}

}
