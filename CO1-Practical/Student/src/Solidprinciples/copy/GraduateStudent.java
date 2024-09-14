package Solidprinciples.copy;
import java.util.ArrayList;
import java.util.List;

public class GraduateStudent implements Student{
	private String id;
    private String name;
    private List<String> enrolledCourses;
    private String thesisTopic;

	public GraduateStudent(String id, String name, String thesisTopic) {
		 this.id = id;
	        this.name = name;
	        this.thesisTopic = thesisTopic;
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
	    public String getThesisTopic() {
	        return thesisTopic;
	    }
	    public void setThesisTopic(String thesisTopic) {
	        this.thesisTopic = thesisTopic;
	    }

}
