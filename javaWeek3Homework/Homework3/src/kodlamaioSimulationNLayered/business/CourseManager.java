package kodlamaioSimulationNLayered.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioSimulationNLayered.core.logging.Logger;
import kodlamaioSimulationNLayered.dataAccess.CoursesDao;
import kodlamaioSimulationNLayered.entities.Category;
import kodlamaioSimulationNLayered.entities.Courses;

public class CourseManager {

	private CoursesDao coursesDao;
	private Logger[] loggers;

	public CourseManager(CoursesDao coursesDao, Logger[] loggers) {
		this.coursesDao = coursesDao;
		this.loggers = loggers;
	}

	ArrayList<String> coursesArrayList = new ArrayList<String>();
	public void add(Courses courses) throws Exception {
		// business rules
		if (courses.getPrice() < 0) {
			throw new Exception("Kurs fiyatý 0dan küçük olamaz");

		}
		
		for (String course : coursesArrayList) {

			if (course == courses.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez.");
			}
		}

		coursesArrayList.add(courses.getCourseName());
		coursesDao.add(courses);

		for (Logger logger : loggers) { 
			logger.log(courses.getCourseName());
		}

	}
}
