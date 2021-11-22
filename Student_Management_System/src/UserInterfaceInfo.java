import java.util.*;

public class UserInterfaceInfo implements UserInterface{
	Scanner sc = new Scanner(System.in);
	AppEngine appEngine = new AppEngine();
	
	Info i = new Info();
	
	
	Enroll enrollment = null;
	Course courses = null;
	Student students = null;
	

	@Override
	public void showFirstScreen() {
		System.out.println("Welcome to SMS(Student Mgmt. System) v1.0");
		System.out.println("Tell us who you are : \n1. Student\n2. Admin");
		System.out.println("Enter your choice ( 1 or 2 ) : ");
		switch(sc.nextInt()) {
		case 1:
			showStudentScreen();
			
			break;
		case 2:
			showAdminScreen();
			break;
		default:
			System.out.println("INALID CHOICE...");
		}
	}

	@Override
	public void showStudentScreen() {
		// TODO Auto-generated method stub
		showStudentRegistrationScreen();
	}

	@Override
	public void showAdminScreen() {
		// TODO Auto-generated method stub
		enrollment = appEngine.enrollment(students, courses);
		appEngine.listOfEnrollments(enrollment);
		showFirstScreen();

	}

	@Override
	public void showAllStudentsScreen() {
		// TODO Auto-generated method stub
		appEngine.listOfStudents(students);
		showFirstScreen();

	}

	@Override
	public void showStudentRegistrationScreen() {
		// TODO Auto-generated method stub
		introduceNewCourseScreen();
		showAllCoursesScreen();
		students = appEngine.register();
		courses = appEngine.courseRegister();
		System.out.println("\n\nStudent successfully registerd......\n\n");
		showFirstScreen();
	}

	@Override
	public void introduceNewCourseScreen() {
		// TODO Auto-generated method stub
		appEngine.introduce();
		
	}

	@Override
	public void showAllCoursesScreen() {
		// TODO Auto-generated method stub
		appEngine.listOfCourses(courses);

	}

}