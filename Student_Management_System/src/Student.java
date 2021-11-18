
public class Student {
	private int studentId;
	private String studentName;
	private int studentDob;
	
	
	public Student(int studentId, String studentName, int studentDob) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDob = studentDob;
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(int studentDob) {
		this.studentDob = studentDob;
	}
	
	
}
