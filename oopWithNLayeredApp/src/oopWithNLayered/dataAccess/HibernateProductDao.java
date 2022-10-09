package oopWithNLayered.dataAccess;

import oopWithNLayered.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	public void add(Product product) {
		//sadece ve sadece db eriþim kodlarý buraya yazýlýr.. SQL
		System.out.println("Hibernate ile veritabanýna eklendi.");
	}


}
