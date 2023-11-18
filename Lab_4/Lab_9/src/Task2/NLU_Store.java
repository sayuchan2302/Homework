package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NLU_Store {
	private List<Publication> publications;

	public NLU_Store() {
		this.publications = new ArrayList<>();
	}

	public void addPublication(Publication pub) {
		this.publications.add(pub);
	}

	public double priceAllPublication() {
		double priceAll = 0;
		for (Publication pub : publications) {
			priceAll += pub.getPrice();

		}
		return priceAll;
	}

	public Chapter findMostPagesChapterInReferenceBooks() {
		Chapter mostPagesChapter = null;
		int maxPages = 0;

		for (Publication pub : publications) {
			if (pub instanceof ReferenceBook) {
				Chapter currentChapter = ((ReferenceBook) pub).findMostPagesChapter();
				if (currentChapter != null && currentChapter.getNumberOfPages() > maxPages) {
					mostPagesChapter = currentChapter;
					maxPages = currentChapter.getNumberOfPages();
				}
			}
		}

		return mostPagesChapter;
	}

	public boolean findMagazineByName(String name) {
		for (Publication pub : publications) {
			if (pub.getType().equals("Magazine") && ((Magazine) pub).getMagezineName().equals(name))
				return true;
		}
		return false;
	}

	public List<Magazine> getMagazinesPublishedInYear(int year) {
		List<Magazine> res = new ArrayList<>();
		for (Publication pub : publications) {
			if (pub.getType().equals("Magazine") && pub.getYear() == year) {
				res.add((Magazine) pub);
			}
		}
		return res;
	}

	public void sortPublications() {
		Collections.sort(publications, (p1, p2) -> {
			int titleComparison = p1.getTitle().compareTo(p2.getTitle());
			if (titleComparison != 0) {
				return titleComparison;
			} else {
				return Integer.compare(p2.getYear(), p1.getYear());
			}
		});
	}

	public Map<Integer, Integer> countPublicationsByYear() {
		Map<Integer, Integer> countByYear = new HashMap<Integer, Integer>();
		for (Publication pub : publications) {
			countByYear.put(pub.getYear(), countByYear.getOrDefault(pub.getYear(), 0) + 1);
		}
		return countByYear;
	}

	@Override
	public String toString() {
		return "NLU_Store [publications=" + publications + "]";
	}
}
