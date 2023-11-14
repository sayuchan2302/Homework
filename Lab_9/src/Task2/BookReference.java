package Task2;

import java.util.ArrayList;
import java.util.List;

public class BookReference extends Publication {
	private String type;
	List<Chapter> chaps = new ArrayList<Chapter>();

	public BookReference(String title, int totalPages, int year, String author, double price, String type) {
		super(title, totalPages, year, author, price);
		this.type = type;
	}

	@Override
	public String xacdinh() {
		// TODO Auto-generated method stub
		return "BookReference";
	}

	@Override
	public boolean checkYearJournal() {
		// TODO Auto-generated method stub
		return false;
	}
	public int totalPages () {
		return chaps.size();
	}

	@Override
	public boolean checkNameJouranl(String name) {
		// TODO Auto-generated method stub
		return false;
	}
}
