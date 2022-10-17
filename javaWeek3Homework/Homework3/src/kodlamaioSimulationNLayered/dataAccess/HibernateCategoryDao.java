package kodlamaioSimulationNLayered.dataAccess;

import kodlamaioSimulationNLayered.business.CategoryManager;
import kodlamaioSimulationNLayered.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanưna eklendi." + category.getCategoryName());
		
	}
}
