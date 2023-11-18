package Task2;

import java.util.ArrayList;
import java.util.List;

public class ReferenceBook extends Publication {
	private String field;
	private List<Chapter> listChaps = new ArrayList<Chapter>();

	public ReferenceBook(String title, int numberOfPages, int year, String author, double price, String field,
			List<Chapter> listChaps) {
		super(title, numberOfPages, year, author, price);
		this.field = field;
		this.listChaps = listChaps;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "ReferenceBook";
	}

	@Override
	public boolean MagazinePublished10yAgo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReferenceBook findMostPages() {
		// TODO Auto-generated method stub
		return null;
	}

	public Chapter findMostPagesChapter() {
		Chapter mostPagesChapter = null;
		int maxPages = 0;

		for (Chapter chapter : listChaps) {
			if (chapter.getNumberOfPages() > maxPages) {
				mostPagesChapter = chapter;
				maxPages = chapter.getNumberOfPages();
			}
		}

		return mostPagesChapter;
	}
}
