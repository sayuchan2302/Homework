package Task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		NLU_Store store = new NLU_Store();

		Chapter chap1 = new Chapter("Intro", 5);
		Chapter chap2 = new Chapter("Chap 1", 33);
		Chapter chap3 = new Chapter("Chap 3", 23);
		List<Chapter> listChaps1 = new ArrayList<Chapter>();
		List<Chapter> listChaps2 = new ArrayList<Chapter>();
		listChaps1.add(chap1);
		listChaps1.add(chap2);
		listChaps1.add(chap3);
		listChaps2.add(chap1);
		listChaps2.add(chap3);

		Magazine maga1 = new Magazine("Title maga 1", 44, 2013, "Author 1", 45.000, "Maga 1");
		Magazine maga2 = new Magazine("Title maga 2", 33, 1967, "Author 2", 79.000, "Maga 3");
		Magazine maga3 = new Magazine("Title maga 2", 33, 1967, "Author 2", 79.000, "Maga 3");
		ReferenceBook refe1 = new ReferenceBook("Title refe 1", 44, 2000, "Author 3", 34.000, "Food", listChaps1);
		ReferenceBook refe2 = new ReferenceBook("Title refe 2", 51, 2004, "Author 4", 65.000, "Travel", listChaps2);
		store.addPublication(maga1);
		store.addPublication(maga2);
		store.addPublication(maga3);
		store.addPublication(refe1);
		store.addPublication(refe2);
//		System.out.println(maga1.getType());
//		System.out.println(refe1.getType());
		System.out.println(maga1.MagazinePublished10yAgo());
		System.out.println(maga2.MagazinePublished10yAgo());
//		System.out.println(maga2.sameTypeAndAuthor(maga3));
//		System.out.println(maga2.sameTypeAndAuthor(maga1));
//		System.out.println(store.priceAllPublication());
//		System.out.println(store.findMagazineByName("Maga 3"));
//		System.out.println(store.getMagazinesPublishedInYear(2011));
//		System.out.println(store.countPublicationsByYear());
//		System.out.println(store.findMostPagesChapterInReferenceBooks());
//		store.sortPublications();
//		System.out.println(store);
	}
}
