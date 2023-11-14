package Task2;

public abstract class Publication {
	protected String title;
	protected int totalPages;
	protected int year;
	protected String author;
	protected double price;

	public Publication(String title, int totalPages, int year, String author, double price) {
		super();
		this.title = title;
		this.totalPages = totalPages;
		this.year = year;
		this.author = author;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getYear() {
		return year;
	}

	public abstract String xacdinh();

	public abstract boolean checkYearJournal();
	public abstract boolean checkNameJouranl (String name);
	public boolean checkTypeAndAuthor(Publication other) {
		return (this.xacdinh().equals(other.xacdinh()) && this.author.equals(other.author));
	}
}
