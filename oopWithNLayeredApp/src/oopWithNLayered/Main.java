package oopWithNLayered;

import oopWithNLayered.business.ProductManager;
import oopWithNLayered.core.logging.DatabaseLogger;
import oopWithNLayered.core.logging.FileLogger;
import oopWithNLayered.core.logging.Logger;
import oopWithNLayered.core.logging.MailLogger;
import oopWithNLayered.dataAccess.HibernateProductDao;
import oopWithNLayered.dataAccess.JdbcProductDao;
import oopWithNLayered.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1, "IphoneXr", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}
