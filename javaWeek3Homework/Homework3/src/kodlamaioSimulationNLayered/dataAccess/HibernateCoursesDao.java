package kodlamaioSimulationNLayered.dataAccess;


import kodlamaioSimulationNLayered.entities.Courses;

public class HibernateCoursesDao implements CoursesDao{

	@Override
	public void add(Courses courses) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanýna eklendi." + courses.getCourseName());
		
	}

	

	

	
	

}
