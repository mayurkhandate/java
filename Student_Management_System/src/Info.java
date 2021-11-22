
public class Info {

	public void display(Enroll[] enroll) {
		for(int i = 0; i < enroll.length; i++) {
			System.out.println("Student ID : " + enroll[i].getStudent().getStudentId() + "\n" + "Student Name : " + enroll[i].getStudent().getStudentName() + "\n" +"Student DOB" + enroll[i].getStudent().getStudentDob());
			System.out.println("Course ID : " + enroll[i].getCourse().getCourseId() + "\n" + "Course Name : " + enroll[i].getCourse().getCourseName()+ "\n" + "Course Duration : "+ enroll[i].getCourse().getCourseDuration() + "\n" + "Course Fees : " + enroll[i].getCourse().getCourseFess());
			System.out.println("Date : " + enroll[i].getEnrollmentDate() + "\n");
		}
	}
	
	public void display(Student students) {
		System.out.println("Student ID : " + students.getStudentId() + "\n" + "Student Name : " + students.getStudentName() + "\n" +"Student DOB" + students.getStudentDob());

	}
	
	public void display(Course courses) {
		System.out.println("Course ID : " + courses.getCourseId() + "\n" + "Course Name : " + courses.getCourseName()+ "\n" + "Course Duration : "+ courses.getCourseDuration() + "\n" + "Course Fees : " + courses.getCourseFess());
	}
	
	public void display(Enroll enroll) {
		System.out.println("Student ID : " + enroll.getStudent().getStudentId() + "\n" + "Student Name : " + enroll.getStudent().getStudentName() + "\n" +"Student DOB" + enroll.getStudent().getStudentDob());
		System.out.println("Course ID : " + enroll.getCourse().getCourseId() + "\n" + "Course Name : " + enroll.getCourse().getCourseName()+ "\n" + "Course Duration : "+ enroll.getCourse().getCourseDuration() + "\n" + "Course Fees : " + enroll.getCourse().getCourseFess());
		System.out.println("Date : " + enroll.getEnrollmentDate() + "\n");
	
			
	}
	
	
	public void display(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			System.out.println("Student ID : " + students[i].getStudentId() + "\n" + "Student Name : " + students[i].getStudentName() + "\n" +"Student DOB" + students[i].getStudentDob());
		}
	}
	
	public void display(Course[] courses) {
		for(int i = 0; i < courses.length; i++) {
			System.out.println("Course ID : " + courses[i].getCourseId() + "\n" + "Course Name : " + courses[i].getCourseName()+ "\n" + "Course Duration : "+ courses[i].getCourseDuration() + "\n" + "Course Fees : " + courses[i].getCourseFess());
		}
	}
	
}
