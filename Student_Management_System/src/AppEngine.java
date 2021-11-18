
public class AppEngine{

	public void introduce(Course course) {
		
	}

    public void register(Student student) {
    	System.out.println("--------------------Details of Student------------------\n");
		System.out.println("Student ID : " + student.getStudentId() + "\n" + "Student Name : " + student.getStudentName() + "\n" +"Student DOB" + student.getStudentDob());
    }

    public Student[] listOfStudents() {
    	Student[] s = new Student[5];
    	
    	return s;
    }

   public Course[] listOfCourses() {
	   Course[] c = new Course[5];
	  
	   return c;
    }

   public void enroll(Student student, Course course) {

    }

   public Enroll[] listOfEnrollments(Enroll[] enroll) {

	   return enroll;
    }
}







