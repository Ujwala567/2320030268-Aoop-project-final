package Solidprinciples.copy;

public interface Student {
	String getId();
    String getName();
    void enrollInCourse(String courseId);
    void dropCourse(String courseId);
    void listEnrolledCourses();
}
