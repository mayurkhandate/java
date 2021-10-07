import static java.lang.System.out; 

public class Demo1 {
	 int n1;
	 static int n2;
	 int p,q;
	 
	 
	 static {
		 out.println("static block");
	 }
	 Demo1(){
		 
	 }
	 
	 Demo1(int p,int q){
		 this.p = p;
		 this.q =q;
		 
	 }
	 
	 void show1() {
		 System.out.println("block");
	 }
	 void show() {
		 out.println("n1 = "+n1);
		 out.println("n2 = "+n2);
	 }
	 
	 public static void display() {
		 Demo1 dd = new Demo1();
		 
		 dd.n1 = 100;
		 dd.n2 = 50;
		 out.println("n1 = " + dd.n1);
		 out.println("n2 = " + dd.n2);
	 }
}
