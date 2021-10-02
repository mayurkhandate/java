
public class Book {
	private int book_id;
	private String book_title;
	private float book_price;
	
	public Book(int book_id, String book_title, float book_price) {
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_price = book_price;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
}
