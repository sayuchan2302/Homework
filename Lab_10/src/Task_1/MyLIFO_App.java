package Task_1;

import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array (mirror)
	public static <E> void reserve(E[] array) {
		// TODO
		Stack<E> stack = new Stack<E>();
		for (E e : array) {
			stack.push(e);
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
	}

	// This method checks the correctness of the given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==>false
	public static boolean isCorrect(String input) {
		// TODO
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char openPeek = stack.peek();
				if ((c == ')' && openPeek == '(') || (c == ']' && openPeek == '[') || c == '}' && openPeek == '{') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	// This method evaluates the value of an expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		if (expression == null || expression.isEmpty()) {
			throw new IllegalArgumentException("Invalid expression");
		}

		Stack<Integer> values = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (c == ' ') {
				continue; // Skip whitespace
			} else if (Character.isDigit(c)) {
				int num = 0;
				while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
					num = num * 10 + (expression.charAt(i) - '0');
					i++;
				}
				i--; // Move back one step as the loop will increment i
				values.push(num);
			} else if (c == '(') {
				operators.push(c);
			} else if (c == ')') {
				while (operators.peek() != '(') {
					char operator = operators.pop();
					int b = values.pop();
					int a = values.pop();
					values.push(calculator(operator, a, b));
				}
				operators.pop(); // Discard the '(' from the stack
			} else if (isOperator(c)) {
				while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
					char operator = operators.pop();
					int b = values.pop();
					int a = values.pop();
					values.push(calculator(operator, a, b));
				}
				operators.push(c);
			}
		}

		while (!operators.isEmpty()) {
			char operator = operators.pop();
			int b = values.pop();
			int a = values.pop();
			values.push(calculator(operator, a, b));
		}

		return values.pop();
	}

	private static boolean isOperator(char c) {
		return (c == '+') || (c == '-') || (c == '/') || (c == 'x');
	}

	private static int precedence(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;
		case 'x':
		case '/':
			return 2;
		}
		return -1;
	}

	private static int calculator(char operator, int a, int b) {
		switch (operator) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case 'x':
			return a * b;
		case '/':
			if (b == 0)
				throw new ArithmeticException("div by zero");
			return a / b;
		}
		return 0;
	}
}
