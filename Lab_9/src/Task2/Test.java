package Task2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		BookstoreManagement store = new BookstoreManagement();
		
		List<Chapter> chaps = new ArrayList<>();
		chaps.add(new Chapter("chap 1", 20));
		chaps.add(new Chapter("chap 2", 16));
		
		BookReference book1 = new BookReference("Sach Y Hoc", 200, 2022, "Tac Gia A", 150.0, "Y Hoc");
		Journal jou1 = new Journal("Tap Chi Giao Duc", 50, 2023, "Tac Gia B", 30.0, "Giao Duc");
		store.add(book1);
		store.add(jou1);
		System.out.println(book1.xacdinh());
		System.out.println(jou1.xacdinh());
	}
}
