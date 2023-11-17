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

	public Magazine findMagazineByName(String name) {
		for (Publication pub : publications) {
			if (pub.getType().equals("Magazine") && ((Magazine) pub).getMagezineName().equals(name))
				return (Magazine) pub;
		}
		return null;
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
			int titleComparison = p1.title.compareTo(p2.title);
			if (titleComparison != 0) {
				return titleComparison;
			} else {
				return Integer.compare(p2.year, p1.year);
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

	public Publication[] getPublications() {
		// TODO Auto-generated method stub
		return null;
	}
}
