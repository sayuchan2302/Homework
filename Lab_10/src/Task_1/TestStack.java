package Task_1;

import java.util.Arrays;

public class TestStack {
	public static void main(String[] args) {
		MyLIFO_App lifo = new MyLIFO_App();
		Integer[] arr = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(arr));
		lifo.reserve(arr);
		System.out.println(Arrays.toString(arr));
		String input1 = "{()}";
		String input2 = "{)))";
		System.out.println(lifo.isCorrect(input1));
		System.out.println(lifo.isCorrect(input2));
		String calculator = "(12x10)/5+100";
		System.out.println(lifo.evaluateExpression(calculator));
	}
}
