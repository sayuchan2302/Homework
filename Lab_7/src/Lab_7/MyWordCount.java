package Lab_7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MyWordCount {
//	 public static final String fileName = "src\\lab_7\\hamlet.txt";
	public static final String fileName = "src\\lab_7\\fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public List<WordCount> getWordCounts() {
		List<WordCount> wordCounts = new ArrayList<>();

		for (String word : words) {
			boolean found = false;

			for (WordCount wordCount : wordCounts) {
				if (wordCount.getWord().equals(word)) {
					wordCount.setCount(wordCount.getCount() + 1);
					found = true;
					break;
				}
			}

			if (!found) {
				WordCount newWordCount = new WordCount(word, 1);
				wordCounts.add(newWordCount);
			}
		}

		return wordCounts;
	}

	// Returns the words that their appearance are 1, do not consider duplidated
	// words

	public Set<String> getUniqueWords() {
		Set<String> uniqueWords = new HashSet<String>();
		List<WordCount> list = getWordCounts();

		for (WordCount word : list) {
			if (word.getCount() == 1) {
				uniqueWords.add(word.getWord());
			}
		}
		return uniqueWords;
	}

	public Set<String> getUniqueWords_v2() {
		Set<String> uniqueWords = new HashSet<String>();
		Set<String> nonUniqueWords = new HashSet<String>();
		for (String word : words) {
			boolean check = false;
			if (!nonUniqueWords.contains(word)) {
				nonUniqueWords.add(word);
			} else {
				check = true;
			}
			if (!check) {
				uniqueWords.add(word);
			} else {
				uniqueWords.remove(word);
			}
		}
		return uniqueWords;

	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	public Set<String> getDistinctWords() {
		// TODO
		Set<String> distinctWords = new HashSet<String>();
		for (String word : words) {
			distinctWords.add(word);
		}
		return distinctWords;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...

	/// dung treset

	public Set<WordCount> printWordCounts() {
		List<WordCount> wordCountsList = getWordCounts();

		Comparator<WordCount> compa = new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				// TODO Auto-generated method stub
				if (Integer.compare(o2.getCount(), o1.getCount()) == 0) {
					return o1.getWord().compareTo(o2.getWord());
				}
				return Integer.compare(o2.getCount(), o1.getCount());
			}
		};
		TreeSet<WordCount> sortWordCount = new TreeSet<WordCount>(compa);
		sortWordCount.addAll(wordCountsList);
		return sortWordCount;

	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according descending order of occurences
	// Example: Bug - 10, An - 3, Nam - 2.
	public Set<WordCount> exportWordCountsByOccurence() {
		// TODO
		List<WordCount> wordCountsList = getWordCounts();
		Comparator<WordCount> compa = new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				// TODO Auto-generated method stub
				if (Integer.compare(o2.getCount(), o1.getCount()) == 0) {
					return o1.getWord().compareTo(o2.getWord());
				}
				return Integer.compare(o1.getCount(), o2.getCount());

			}
		};
		TreeSet<WordCount> sorted = new TreeSet<WordCount>(compa);
		sorted.addAll(wordCountsList);
		return sorted;
	}

	// delete words begining with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(String pattern) {
		// TODO
		Set<String> filterWords = new HashSet<String>();
		for (String word : words) {
			if (!word.startsWith(pattern)) {
				filterWords.add(word);
			}
		}
		return filterWords;
	}
}
