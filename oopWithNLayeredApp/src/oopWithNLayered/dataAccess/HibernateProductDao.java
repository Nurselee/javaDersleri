package oopWithNLayered.dataAccess;

import oopWithNLayered.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	public void add(Product product) {
		//sadece ve sadece db eri�im kodlar� buraya yaz�l�r.. SQL
		System.out.println("Hibernate ile veritaban�na eklendi.");
	}


}
