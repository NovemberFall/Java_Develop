public class TextBook{
	private String title;
	private String author;
	private String publisher;

	public TextBook(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public TextBook(TextBook obj){
		title = obj.title;
		author = obj.author;
		publisher = obj.publisher;
	}

	public void set(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public String toString(){
		String str = "Title: " + title +
					"\nAuthor: " + author + 
					"\nPublisher: " + publisher;

		return str;
	}
}