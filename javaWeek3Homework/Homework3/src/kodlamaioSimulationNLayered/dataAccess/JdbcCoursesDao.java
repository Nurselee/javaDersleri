package kodlamaioSimulationNLayered.dataAccess;


import kodlamaioSimulationNLayered.entities.Courses;

public class JdbcCoursesDao implements CoursesDao{

	@Override
	public void add(Courses courses) {
		
		System.out.println("Kurs JDBC ile veritaban�na eklendi." + courses.getCourseName());
	}

	

}
