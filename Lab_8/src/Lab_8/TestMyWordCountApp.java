package Lab_8;

import java.io.FileNotFoundException;

public class TestMyWordCountApp {
	public static void main(String[] args) throws FileNotFoundException {
		MyWordCountApp w1 = new MyWordCountApp();
		w1.loadData();
		System.out.println("COUNT UNIQUE: " + w1.countUnique());
		w1.printWordCounts();
		w1.printWordCountsAlphabet();
	}
}
