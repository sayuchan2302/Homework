package Task2;

public class Magazine extends Publication {
	private String magezineName;

	public Magazine(String title, int numberOfPages, int year, String author, double price, String magezineName) {
		super(title, numberOfPages, year, author, price);
		this.magezineName = magezineName;
	}

	public String getMagezineName() {
		return magezineName;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Magazine";
	}

	@Override
	public boolean MagazinePublished10yAgo() {
		// TODO Auto-generated method stub
	//	return (this.year + 10 <= 2021 && this.year > 2011);
		return this.year >= 2011 && this.year <= 2021 ;
	}

	@Override
	public ReferenceBook findMostPages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Magazine [magezineName=" + magezineName + ", " + super.toString() + "]";
	}
}
