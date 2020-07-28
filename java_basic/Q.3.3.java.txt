package test1;

import java.util.Scanner;

public class Book_details //Q.3
{
	public Book[] createBooks()
	{
		Scanner sc = new Scanner(System.in);
		Book[] b = new Book[2];
		b[0] = new Book("Java Programming",350.50);
		b[1] = new Book("Let Us C        ",200.00);
		sc.close();
		return b;
	}
	public void showBooks(Book[] b)
	{
		System.out.println("Book Title\t\tBook Price");
			System.out.println(b[0]);
			System.out.println(b[1]);
	}
}