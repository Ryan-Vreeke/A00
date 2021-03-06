package books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookApp {

	public BookApp() {

	}

	public static void main(String[] args) {
		List<Book> result = Book.getList("C:\\Users\\rvree\\eclipse-workspace\\A00\\src\\books\\books.csv");
		System.out.println(result.size());

		Collections.sort(result);
		for (Book b : result) {
			System.out.println(b);
		}

		Collections.reverse(result);
		System.out.println();

		for (Book b : result) {
			System.out.println(b);
		}
		
		
		
	}

}
