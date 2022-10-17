package kodlamaioSimulationNLayered.dataAccess;

import kodlamaioSimulationNLayered.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile veritabanýna eklendi." + category.getCategoryName());
	}

}
