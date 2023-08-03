package 허재혁실기평가;

public class Quiz7_book {
	
	String bookCode;
	String bookTitle;
	String author;

	
	
	
	public Quiz7_book() {
		
	}
	
	public Quiz7_book(String bookCode, String bookTitle, String author) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}


	@Override
	public String toString() {
		return "Quiz7 [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", author=" + author + "]";
	}
	


	


}
