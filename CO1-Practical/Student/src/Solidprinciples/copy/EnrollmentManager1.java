package Solidprinciples.copy;

public class EnrollmentManager1 {
	 public void enroll(Student student, Course course) {
	        course.enrollStudent(student);
	    }

	    public void drop(Student student, Course course) {
	        course.dropStudent(student);
	    }
}
