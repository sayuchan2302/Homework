package Task2;

public class Journal extends Publication {
	private String name;

	public Journal(String title, int totalPages, int year, String author, double price, String name) {
		super(title, totalPages, year, author, price);
		this.name = name;
	}

	@Override
	public String xacdinh() {
		// TODO Auto-generated method stub
		return "Journal";
	}

	@Override
	public boolean checkYearJournal() {
		// TODO Auto-generated method stub
		return this.year == (2021 - 10);

	}

	@Override
	public boolean checkNameJouranl(String name) {
		// TODO Auto-generated method stub
		return this.name.equals(name);
	}
	
}
