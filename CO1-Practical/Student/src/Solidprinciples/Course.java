package Solidprinciples;
import java.util.ArrayList;
import java.util.List;
public class Course {
	private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;
    public Course(String courseId, String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
	public String getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollInCourse(courseId);
    }
    public void dropStudent(Student student) {
        enrolledStudents.remove(student);
        student.dropCourse(courseId);
    }
    public void listEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }

}
