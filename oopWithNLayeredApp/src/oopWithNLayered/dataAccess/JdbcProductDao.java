package oopWithNLayered.dataAccess;

import oopWithNLayered.entities.Product;

public class JdbcProductDao implements ProductDao{
	
	public void add(Product product) {
		//sadece ve sadece db eri�im kodlar� buraya yaz�l�r.. SQL
		System.out.println("JDBC ile veritaban�na eklendi.");
	}

}
