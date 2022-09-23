package classesWithAttributes;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product(1, "Laptop", "AsusLaptop", 3000, 2, "Siyah");
		product.setName("laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getCode());
	}

}
