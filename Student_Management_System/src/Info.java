
public class Info {

	public void display(Enroll[] enroll) {
		for(int i = 0; i < enroll.length; i++) {
			System.out.println("Student ID : " + enroll[i].getStudent().getStudentId() + "\n" + "Student Name : " + enroll[i].getStudent().getStudentName() + "\n" +"Student DOB" + enroll[i].getStudent().getStudentDob());
			System.out.println("Course ID : " + enroll[i].getCourse().getCourseId() + "\n" + "Course Name : " + enroll[i].getCourse().getCourseName()+ "\n" + "Course Duration : "+ enroll[i].getCourse().getCourseDuration() + "\n" + "Course Fees : " + enroll[i].getCourse().getCourseFess());
			System.out.println("Date : " + enroll[i].getEnrollmentDate() + "\n");
		}
	}
	
	
//	public void display(Student student) {
//		
//	}
//	
//	public void display(Course course) {
//		
//	}
	
}
