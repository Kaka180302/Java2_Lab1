package product;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Product> dsProduct = new ArrayList<Product>();
		
		ImportedProduct iP = new ImportedProduct();
		iP.setId("SP1");
		iP.setName("Áo Sơ Mi");
		iP.setBasePrice(10);
		iP.setImportTaxRate(0.1);
		iP.setShippingFee(2);
		dsProduct.add(iP);
		
		ImportedProduct iP2 = new ImportedProduct();
		iP2.setId("SP2");
		iP2.setName("Quần Jean");
		iP2.setBasePrice(20);
		iP2.setImportTaxRate(0.15);
		iP2.setShippingFee(3);
		dsProduct.add(iP2);
		
		Product p3 = new Product("SP3","Áo thun",15);
		Product p4 = new Product("SP4","Giày",30);
		Product p5 = new Product("SP5","Nón",8);
		
		dsProduct.add(p3);
		dsProduct.add(p4);
		dsProduct.add(p5);
		
		
		for(Product p : dsProduct) {
			System.out.println(p);
		}
		
		
		Product max = dsProduct.get(0);
		
		for(Product p : dsProduct) {
			if (p.finalPrice() > max.finalPrice()) {
				max = p;
			}
		}
		
		System.out.println("\nSản phẩm có giá cao nhất:");
        System.out.println(max);
	}
}