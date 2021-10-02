import java.util.*;

public class BookInfo {
	Scanner sc = new Scanner(System.in);
	
	public Book createBooks() {
		System.out.println("Enter Book ID : ");
		int book_id = sc.nextInt();
		
		System.out.println("Enter Book Name : ");
		String book_title = sc.next();
		
		System.out.println("Enter Book Price : ");
		float book_price = sc.nextFloat();
		Book b = new Book(book_id,book_title,book_price);
		
		return b;
	}
	
	public void showBooks(Book b) {
		System.out.println("\n\n\t Book Title\t\tBook Price  \n\n");
		System.out.println("\n\t Book ID \t: \t" + b.getBook_id());
		System.out.println("\n\t Book Name \t: \t" + b.getBook_title());
		System.out.println("\n\t Book Price \t: \t" + b.getBook_price());
	}
}
