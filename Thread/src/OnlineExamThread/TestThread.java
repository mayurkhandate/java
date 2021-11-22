package OnlineExamThread;
import java.util.*;

public class TestThread{
	Scanner sc = new Scanner(System.in);
	String[] questions = {"10 + 20 = ? ","10 - 30 = ?","10 * 10 = ?", "10 % 2 = ?"};
	int questionsLength = questions.length;
	int marks = 0;
	
	int[] correctAnswers = {30,-20,100,5};
	
	int[] answers= new int[5]; 
	
	public void questions() {
		System.out.println("\nGIVE ANSWER IN 1 MINUTE && GIVE ANSWER IN SEQUENCE IF YOU DONT KNOW ANSWER TYPE NA "
				+ "BUT DONT BREAK THE SEQUENCE ELSE YOU WILL GET 0 MARKS \n\n ");
		
		for(int i = 0; i < questionsLength; i++) {
			System.out.println();
			System.out.println(i+1 +"."+ questions[i]);
			System.out.print("--> ");
			answers[i] = sc.nextInt();
		}
	}
	
	public int check() {
		for(int i = 1; i < questionsLength; i++) {
			if(answers[i] == correctAnswers[i]){
				marks = marks + 1;
			}
			
		}
		return marks;
	}
	
	
}
