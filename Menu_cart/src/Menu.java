import java.util.*;

public class Menu {
	public static void main(String[] args) {
		
		Bill b = new Bill();
		int r = b.show_menu();
		b.display(r);
		int r1=b.caluclate_bill();
		b.display_bill(r1);
	}
}
