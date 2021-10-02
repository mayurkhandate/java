import java.util.*;

public class BookMain {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		BookInfo bi = new BookInfo();
		Book b = bi.createBooks();
		bi.showBooks(b);

	}
	
}
