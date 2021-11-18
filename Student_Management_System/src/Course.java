
public class Course {
	private int courseId;
	private String courseName;
	private int courseDuration;
	private double courseFees;
	

	public Course(int courseId, String courseName, int courseDuration, double courseFees) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}


	public double getCourseFess() {
		return courseFees;
	}


	public void setCourseFess(double courseFees) {
		this.courseFees = courseFees;
	}
	
	
	
	
}
