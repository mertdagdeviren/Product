package oopİntro;

public class Main {

	public static void main(String[] args) {
		
		// Çýktýda iki kez "Ben çalýţtým" yazmasýnýn sebebi, iki kere Product() constructor çađýrdýđýmýz içindir.
		// Ýlk satýr ise içerisinde deđiţkenler olan constructor ile bađýntýlýdýr.
		// Yani ayný adda iki constructor tanýmlanabilir ve iţlem durumlarýna göre belirli constructor çađýrýlýr.
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10);
		
		Product product2 = new Product(); //Referans oluţturma, instance
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("İçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}