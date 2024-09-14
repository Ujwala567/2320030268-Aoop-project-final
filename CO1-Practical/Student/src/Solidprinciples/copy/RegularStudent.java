package Solidprinciples.copy;
import java.util.ArrayList;
import java.util.List;

public class RegularStudent implements Student{
	 private String id;
	    private String name;
	    private List<String> enrolledCourses;

	public RegularStudent(String id, String name) {
		 this.id = id;
	        this.name = name;
	        this.enrolledCourses = new ArrayList<>();
	}
	 public String getId() {
	        return id;
	 }
	    public String getName() {
	        return name;
	    }
	    public void enrollInCourse(String courseId) {
	        enrolledCourses.add(courseId);
	        System.out.println(name + " enrolled in course: " + courseId);
	    }
	    public void dropCourse(String courseId) {
	        enrolledCourses.remove(courseId);
	        System.out.println(name + " dropped course: " + courseId);
	    }
	    public void listEnrolledCourses() {
	        System.out.println(name + " is enrolled in: " + enrolledCourses);
	    }

}
