package Lab_7;

public class Main {
	public static void main(String[] args) {
		MyWordCount word = new MyWordCount();
		System.out.println("Get word count: " + word.getWordCounts());
		System.out.println("========================");
		System.out.println("Unique Word form file: " + word.getUniqueWords());
		System.out.println("========================");
		System.out.println("Distinct Word form file: " + word.getDistinctWords());
		System.out.println("========================");
		System.out.println("Print count: ");
		System.out.println(word.printWordCounts());
		System.out.println("========================");
		System.out.println("Export Word Counts By Occurence: ");
		System.out.println(word.exportWordCountsByOccurence());
		System.out.println("========================");
		System.out.println("Delete word start with D: ");
		System.out.println(word.filterWords("D"));

	}
}
