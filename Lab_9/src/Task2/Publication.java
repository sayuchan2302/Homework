package Task2;

public abstract class Publication {
	protected String title;
	protected int numberOfPages;
	protected int year;
	protected String author;
	protected double price;

	public Publication(String title, int numberOfPages, int year, String author, double price) {
		super();
		this.title = title;
		this.numberOfPages = numberOfPages;
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

	public abstract String getType();

	public abstract boolean MagazinePublished10yAgo();

	public boolean sameTypeAndAuthor(Publication other) {
		return this.getType().equals(other.getType()) && this.author.equals(other.author);
	}

	public abstract ReferenceBook findMostPages();
}
