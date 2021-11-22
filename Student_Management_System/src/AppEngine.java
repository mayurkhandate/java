import java.time.LocalDate;
import java.util.*;

public class AppEngine{
	Scanner sc = new Scanner(System.in);
	Info info = new Info();
	
	public void introduce() {
		
		System.out.println("------------------------------Introduction to Program-----------------------\n\n");

		System.out.println("This all courses will give you core knowledge of programing and you will learn \n" +
		"real time implementation using core concept that you will learn in each course \n" +
		"while learning the core concept you will also develop INDUSTRY PROJECT side by side. \n\n");
		
	}

    public Student register() {
    	System.out.println("\n\n----------------------------Register Student---------------------------\n");
//    	System.out.println("Enter how many student you want to Enroll : ");
//		int n = sc.nextInt();
//		Student[] student = new Student[n];
//		int i = 0;
    	
		
    	System.out.println("Enter student ID : ");
		int studentId = sc.nextInt();
		
		System.out.println("Enter Student NAME : ");
		String studentName = sc.next();
		
		System.out.println("Enter Student DOB : ");
		int studentDob = sc.nextInt();
		
		Student student = new Student(studentId,studentName,studentDob);
		
		
		return student;
    }
    
    public Course courseRegister() {
    	System.out.println("Enter Course ID : ");
		int courseId = sc.nextInt();
		
		System.out.println("Enter Course NAME : ");
		String courseName = sc.next();
		
		System.out.println("Enter Course Duration : ");
		int courseDuration = sc.nextInt();
		
		
		System.out.println("Enter Course Fees : ");
		double courseFees = sc.nextDouble();
		
		Course course = new Course(courseId,courseName,courseDuration,courseFees);
		
		return course;
    }

    public void listOfStudents(Student students) {
    	System.out.println("--------------------------------------List of Student-------------------------------\n\n");
    	info.display(students);
    }

   public void listOfCourses(Course coursesRegister) {
   		System.out.println("---------------------------------------List of Courses--------------------------------\n\n");
		int[] courseId = {1,2,3};
		String[] courseName = {"java","python","angular"};
		int[] courseDuration = {5,7,4};
		double[] courseFees = {500,700,400};
		
		for(int i = 0; i < courseId.length; i++) {
			System.out.println("COURSE ID :  " + courseId[i]  + "\t" + "COURSE NAME : " + courseName[i] + "\t" + 
								"COURSE DURATION : " + courseDuration[i] + " Weeks" + "\t" + "COURSE FEES : $" + courseFees[i]);
		}
   }

   public Enroll enrollment(Student student, Course courseRegister) {

		LocalDate enrollmentDate = LocalDate.now();
		
		Enroll enroll = new Enroll(student,courseRegister,enrollmentDate);
		
		return enroll;
   }

   public void listOfEnrollments(Enroll enroll) {
//	   for(int i = 0; i < enroll.length; i++) {
//			System.out.println("Student ID : " + enroll[i].getStudent().getStudentId() + "\n" + "Student Name : " + enroll[i].getStudent().getStudentName() + "\n" +"Student DOB" + enroll[i].getStudent().getStudentDob());
//			System.out.println("Course ID : " + enroll[i].getCourse().getCourseId() + "\n" + "Course Name : " + enroll[i].getCourse().getCourseName()+ "\n" + "Course Duration : "+ enroll[i].getCourse().getCourseDuration() + "\n" + "Course Fees : " + enroll[i].getCourse().getCourseFess());
//			System.out.println("Date : " + enroll[i].getEnrollmentDate() + "\n");
//		}
   		System.out.println("--------------------List of Enroll Students------------------\n");
	   info.display(enroll);
   }
   
}







