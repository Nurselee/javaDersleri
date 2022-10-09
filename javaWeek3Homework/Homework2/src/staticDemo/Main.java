package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 10;
        productManager.add(product);
        
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
	}

}
