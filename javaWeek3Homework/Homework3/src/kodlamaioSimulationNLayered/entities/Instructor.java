package kodlamaioSimulationNLayered.entities;

public class Instructor {
	private int instructorId;
	private String instructorName;
	private String[] coursesOfInstructor;

	public Instructor(int instructorId, String instructorName, String[] coursesOfInstructor) {
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.coursesOfInstructor = coursesOfInstructor;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String[] getCoursesOfInstructor() {
		return coursesOfInstructor;
	}

	public void setCoursesOfInstructor(String[] coursesOfInstructor) {
		this.coursesOfInstructor = coursesOfInstructor;
	}

}
