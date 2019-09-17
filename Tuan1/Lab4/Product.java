package Lab4;

import java.util.Scanner;

public class Product {
	private String productName;
	private double untiPrice;
	private double saleOff;

	public Product(String productName, double untiPrice, double saleOff) {

		this.productName = productName;
		this.untiPrice = untiPrice;
		this.saleOff = saleOff;
	}

	public Product(String productName, double untiPrice) {

		this.productName = productName;
		this.untiPrice = untiPrice;
	}

	public Product() {

	}

	public String getproductName() {
		return productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public double getuntiPrice() {
		return untiPrice;
	}

	public void setuntiPrice(double untiPrice) {
		this.untiPrice = untiPrice;
	}

	public double getsaleOff() {
		return saleOff;
	}

	public void setsaleOff(double saleOff) {
		this.saleOff = saleOff;
	}

	private double getThueimportArraysKhau() {
		return this.getuntiPrice() * 0.1; // quay lÃªn chá»— double getuntiPrice

	}

	public void importArrays() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Nháº­p tÃªn sáº£n pháº©m:");
		String productName = Sc.nextLine();
		this.setproductName(productName);
		System.out.print("Nháº­p Ä‘Æ¡n giÃ¡ sáº£n pháº©m");
		double untiPrice = Sc.nextDouble();
		this.setuntiPrice(untiPrice);
		System.out.print("Nháº­p giÃ¡ giáº£m:");
		double saleOff = Sc.nextDouble();
		this.setsaleOff(saleOff);
	}

	public void exportArrays() {
		System.out.println("TÃªn Sáº£n Pháº§m:" + this.getproductName());
		System.out.println("Ä�Æ¡n GiÃ¡ Sáº£n Pháº©m:" + this.getuntiPrice());
		System.out.println("Tiá»�n Giáº£m GiÃ¡:" + this.getsaleOff());
		System.out.println("Thuáº¿:" + this.getThueimportArraysKhau());
	}

	public void importArraysMang() {
		System.out.print("Nháº­p sá»‘ lÆ°á»£ng sáº£n pháº©m");
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		Product[] Sp = new Product[n];
		for (int i = 0; i < n; i++) {
			Product containsProduct = new Product();
			containsProduct.importArrays();
			Sp[i] = containsProduct;

		}
		for (int i = 0; i < n; i++) {
			System.out.println("TÃªn Sáº£n Pháº§m:" + Sp[i].getproductName());
			System.out.println("Ä�Æ¡n GiÃ¡ Sáº£n Pháº©m:" + Sp[i].getuntiPrice());
			System.out.println("Tiá»�n Giáº£m GiÃ¡:" + Sp[i].getsaleOff());
			System.out.println("Thuáº¿:" + Sp[i].getThueimportArraysKhau());
		}
	}
}
