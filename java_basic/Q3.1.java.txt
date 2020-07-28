package test1;

public class Book_main //Q.3
{
	public static void main(String[] args)
	{
		Book_details bd = new Book_details();
		Book[] b = bd.createBooks();
		bd.showBooks(b);
	}
}