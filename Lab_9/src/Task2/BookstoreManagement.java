package Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookstoreManagement {
	private List<Publication> list;

	public BookstoreManagement() {
		list = new ArrayList<>();
	}

	public void add(Publication that) {
		list.add(that);
	}

	public double priceAll() {
		double res = 0;
		for (Publication pub : list) {
			res += pub.getPrice();
		}
		return res;
	}

	public BookReference findBookHaveMostPages() {
		int pageMax = 0;
		BookReference res = null;
		for (Publication pub : list) {
			if (pub.xacdinh().equals("BookReference")) {
				if (pub.totalPages > pageMax) {
					pageMax = pub.totalPages;
					res = (BookReference) pub;
				}
			}
		}
		return res;
	}

	public Publication findNameJournal(String name) {
		for (Publication pub : list) {
			if (pub.xacdinh().equals("Journal")) {
				if (pub.checkNameJouranl(name))
					return pub;
			}
		}
		return null;
	}

	public List<Publication> findListOfYear(int year) {
		List<Publication> res = new ArrayList<>();
		for (Publication pub : list) {
			if (pub.xacdinh().equals("Journal") && pub.year == year) {
				res.add(pub);
			}
		}
		return null;
	}

	public void sortList() {
		Comparator<Publication> compa = new Comparator<Publication>() {

			@Override
			public int compare(Publication o1, Publication o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

	public Map<Integer, Integer> statistics() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Publication pub : list ) {
			if (map.containsKey(pub.getYear())) {
			
			}
		}
		return map;
	}
}
