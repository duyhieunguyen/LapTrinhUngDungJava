//package Lab4;
//
//import java.util.Scanner;
//
//public class Product {
//	private String productName ;
//	private double untiPrice;
//	private double saleOff;
//	
//	
//	
//	public Product(String productName, double untiPrice, double saleOff) {
//		
//		this.productName = productName;
//		this.untiPrice = untiPrice;
//		this.saleOff = saleOff;
//	}
//
//
//
//	public Product(String productName, double untiPrice) {
//		
//		this.productName = productName;
//		this.untiPrice = untiPrice;
//	}
//
//
//
//	public Product() {
//		
//	}
//
//
//
//	public String getproductName() {
//		return productName;
//	}
//
//
//
//	public void setproductName(String productName) {
//		this.productName = productName;
//	}
//
//
//
//	public double getuntiPrice() {
//		return untiPrice;
//	}
//
//
//
//	public void setuntiPrice(double untiPrice) {
//		this.untiPrice = untiPrice;
//	}
//
//
//
//	public double getsaleOff() {
//		return saleOff;
//	}
//
//
//
//	public void setsaleOff(double saleOff) {
//		this.saleOff = saleOff;
//	}
//
//
//
//	private double getThueimportArraysKhau()
//	{
//		return this.getuntiPrice() *0.1; //quay lên chỗ double getuntiPrice
//		
//	}
//	public void importArrays()
//	{
//		Scanner Sc = new Scanner (System.in);
//		System.out.print("Nhập tên sản phẩm:");
//		String productName = Sc.nextLine();
//		this.setproductName(productName);
//		System.out.print("Nhập đơn giá sản phẩm");
//		double untiPrice = Sc.nextDouble();
//		this.setuntiPrice(untiPrice);
//		System.out.print("Nhập giá giảm:");
//		double saleOff =Sc.nextDouble();
//		this.setsaleOff(saleOff);
//	}
//	public void exportArrays()
//	{
//		System.out.println("Tên Sản Phầm:" + this.getproductName());
//		System.out.println("Đơn Giá Sản Phẩm:" +this.getuntiPrice());
//		System.out.println("Tiền Giảm Giá:" +this.getsaleOff());
//		System.out.println("Thuế:" +this.getThueimportArraysKhau());
//	}
//	public void importArraysMang ()
//	{
//		System.out.print("Nhập số lượng sản phẩm");
//		Scanner Sc = new Scanner (System.in);
//		int n = Sc.nextInt();
//		Product[] Sp = new Product [n];
//		for (int i =0; i< n; i++)
//		{
//			Product containsProduct = new Product();
//			containsProduct.importArrays();
//			Sp[i] = containsProduct;
//			
//			
//		}
//		for(int i =0; i<n ; i++)
//		{
//			System.out.println("Tên Sản Phầm:" + Sp[i].getproductName());
//			System.out.println("Đơn Giá Sản Phẩm:" +Sp[i].getuntiPrice());
//			System.out.println("Tiền Giảm Giá:" +Sp[i].getsaleOff());
//			System.out.println("Thuế:" +Sp[i].getThueimportArraysKhau());
//		}
//	}
//}
//
//
//
//
