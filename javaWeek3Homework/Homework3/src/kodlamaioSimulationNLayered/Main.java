package kodlamaioSimulationNLayered;



import java.nio.channels.NonWritableChannelException;

import kodlamaioSimulationNLayered.business.CategoryManager;
import kodlamaioSimulationNLayered.business.CourseManager;
import kodlamaioSimulationNLayered.core.logging.DatabaseLogger;
import kodlamaioSimulationNLayered.core.logging.FileLogger;
import kodlamaioSimulationNLayered.core.logging.Logger;
import kodlamaioSimulationNLayered.core.logging.MailLogger;
import kodlamaioSimulationNLayered.dataAccess.CoursesDao;
import kodlamaioSimulationNLayered.dataAccess.HibernateCategoryDao;
import kodlamaioSimulationNLayered.dataAccess.HibernateCoursesDao;
import kodlamaioSimulationNLayered.entities.Category;
import kodlamaioSimulationNLayered.entities.Courses;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Courses course1 = new Courses(1, "Java", 20, "Engin", "Elma", 100);
		Courses course2 = new Courses(2, "C", 20, "Engin", "Armut", 200);
		Courses course3 = new Courses(3, "Python", 20, "Engin", "Çilek", -200);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};		
		CourseManager coursesManager = new CourseManager(new HibernateCoursesDao(), loggers);
		coursesManager.add(course1);
		coursesManager.add(course2);
		coursesManager.add(course3);
		
		Category category1 = new Category(1, "Elma");
		Category category2 = new Category(2, "Armut");
		Category category3 = new Category(3, "Çilek");
		Category category4 = new Category(4, "Çilek");
		Logger[] logger2 = {new DatabaseLogger(), new FileLogger(), new MailLogger()};	
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), logger2);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		categoryManager.add(category4);
	}

}
