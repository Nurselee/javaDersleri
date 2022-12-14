package kodlamaioSimulationNLayered.business;

import java.util.ArrayList;

import kodlamaioSimulationNLayered.core.logging.Logger;
import kodlamaioSimulationNLayered.dataAccess.CategoryDao;
import kodlamaioSimulationNLayered.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	ArrayList<String> categoryArrayList = new ArrayList<String>();

	public void add(Category category) throws Exception {
		// business rules

		for (String categoryi : categoryArrayList) {

			if (categoryi == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}

		categoryArrayList.add(category.getCategoryName());
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}
}
