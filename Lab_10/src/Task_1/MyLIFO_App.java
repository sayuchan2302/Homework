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
	public static double evaluateExpression(String expression) {
		if (expression == null || expression.isEmpty()) {
			throw new IllegalArgumentException("Invalid expression");
		}
		Stack<Double> values = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (c == ' ') {
				continue;
			} // Skip whitespace
			else if (Character.isDigit(c) || c == '.') {
				StringBuilder numStr = new StringBuilder();
				while (i < expression.length()
						&& (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
					numStr.append(expression.charAt(i));
					i++;
				}
				i--; // Move back one step as the loop will increment i
				values.push(Double.parseDouble(numStr.toString()));

			} else if (c == '(') {
				operators.push(c);
			} else if (c == ')') {
				while (operators.peek() != '(') {
					char operator = operators.pop();
					Double b = values.pop();
					Double a = values.pop();
					values.push(calculator(operator, a, b));
				}
				operators.pop(); // Discard the '(' from the stack
			} else if (isOperator(c)) {
				while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
					char operator = operators.pop();
					Double b = values.pop();
					Double a = values.pop();
					values.push(calculator(operator, a, b));
				}
				operators.push(c);
			}
		}

		while (!operators.isEmpty()) {
			char operator = operators.pop();
			Double b = values.pop();
			Double a = values.pop();
			values.push(calculator(operator, a, b));
		}

		return values.pop();
	}

	public static double evaluateExpression1(String expression) {
		if (expression.equals(" ") || expression == null)
			return 0.0;
		return 0.0;
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

	private static double calculator(char operator, double a, double b) {
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
		return 0.0;
	}
}
