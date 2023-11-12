package Lab_8;

import java.io.IOException;

public class TestAnalyzer {
	public static void main(String[] args) throws IOException {
		TextAnalyzer textAnalyzer = new TextAnalyzer();
		textAnalyzer.load("src//data//short.txt");
		textAnalyzer.displayWords();
		textAnalyzer.displayText() ;
		System.out.println("Most frequently: "+textAnalyzer.mostFrequentWord());
	}
}
