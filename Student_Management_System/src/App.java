
public class App {
	
	public static void main(String ars[]) {
		
		new UserInterfaceInfo().showFirstScreen();
		
	}
	
}































/*

public static Enroll[] scenario1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many student you want to Enroll : ");
		int n = sc.nextInt();

		Enroll[] enroll = new Enroll[n];	
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter student ID : ");
			int studentId = sc.nextInt();
			
			System.out.println("Enter Student NAME : ");
			String studentName = sc.next();
			
			System.out.println("Enter Student DOB : ");
			int studentDob = sc.nextInt();
			
			
			System.out.println("Enter Course ID : ");
			int courseId = sc.nextInt();
			
			System.out.println("Enter Course NAME : ");
			String courseName = sc.next();
			
			System.out.println("Enter Course Duration : ");
			int courseDuration = sc.nextInt();
			
			
			System.out.println("Enter Course Fees : ");
			double courseFees = sc.nextDouble();
			
			
			Course course = new Course(courseId,courseName,courseDuration,courseFees);
			
			
			Student student = new Student(studentId,studentName,studentDob,course);
			
			LocalDate enrollmentDate = LocalDate.now();
			
			enroll[i] = new Enroll(student,course,enrollmentDate);
		}
		
		return enroll;
	}

*/