package books;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Book implements Comparable<Book> {

	String title;
	String author;
	int year;

	public Book() {

	}

	public Book(String title, String author, int year) {

		this.title = title;
		this.author = author;
		this.year = year;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return title + " by " + author + " (" + year + ")";
	}

	public static List<Book> getList(String file) {

		List<Book> records = new ArrayList<>();
		try {
			Scanner input = new Scanner(new File(file));
			while (input.hasNextLine()) {
				String[] r = input.nextLine().split(",");
				if (r.length == 3) {

					records.add(new Book(r[0], r[1], Integer.parseInt(r[2])));
				} else {
					
					System.err.println("Problem reading in \"" + r[0] + "\"");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return records;
	}

	@Override
	public int compareTo(Book o) {
		return -o.getTitle().compareTo(this.title);
	}

}
