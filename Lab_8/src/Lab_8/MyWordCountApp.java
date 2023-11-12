package Lab_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MyWordCountApp {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "src//data//fit.txt";
	// <word, its occurences>
	private Map<String, Integer> map = new HashMap<String, Integer>();

	// Load data from fileName into the above map (containing <word, its
	// occurences>)
	// using the guide given in TestReadFile.java
	public void loadData() throws FileNotFoundException {
		// TODO
		Scanner file = new Scanner(new File(fileName));
		while (file.hasNext()) {
			String text = file.next();
			if (map.containsKey(text)) {
				map.put(text, map.get(text) + 1);
			} else {
				map.put(text, 1);
			}
		}
	}

	// Returns the number of unique tokens in the file data/hamlet.txt or fit.txt
	public int countUnique() {
		// TODO
		return map.size();
	}

	public void print() {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey());
		}
		System.out.println();
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public void printWordCounts() throws FileNotFoundException {
		// TODO
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " ");
		}
		System.out.println();
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according to ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public void printWordCountsAlphabet() {
		Map<String, Integer> sortedMap = new TreeMap<>(map);
		map.putAll(sortedMap);
		System.out.println(sortedMap);
	}
}
