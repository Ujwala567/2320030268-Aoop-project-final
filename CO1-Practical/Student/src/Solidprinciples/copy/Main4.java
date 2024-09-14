package Solidprinciples.copy;

public class Main4 {

	public static void main(String[] args) {
		Student student1 = new RegularStudent("S001", "John Doe");
        Student student2 = new GraduateStudent("S002", "Jane Smith", "AI Research");
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Computer Science");
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course2);
        course1.listEnrolledStudents();
        course2.listEnrolledStudents();
        student1.listEnrolledCourses();
        student2.listEnrolledCourses();
        enrollmentManager.drop(student1, course1);
        course1.listEnrolledStudents();
    }

	}

