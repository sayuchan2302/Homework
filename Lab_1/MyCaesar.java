package Task;

public class MyCaesar {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n; // số bước dịch (dịch sang phải)

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	// Mã hóa một kí tự theo số bước dịch đã cho
	public char encryptChar(char c) {
		if (Character.isLetter(c)) {
			// Chuyển đổi kí tự thành viết hoa để phù hợp với ALPHABET
			c = Character.toUpperCase(c);

			// Tìm vị trí của kí tự trong ALPHABET
			int index = -1;
			for (int i = 0; i < ALPHABET.length; i++) {
				if (ALPHABET[i] == c) {
					index = i;
					break;
				}
			}

			// Mã hóa kí tự
			if (index != -1) {
				int encryptedIndex = (index + n) % ALPHABET.length;
				return ALPHABET[encryptedIndex];
			}
		}
		// Trường hợp kí tự không thuộc ALPHABET hoặc không phải là chữ cái
		return c;
	}

	// Giải mã một kí tự theo số bước dịch đã cho
	public char decryptChar(char c) {
		// Đảm bảo kí tự đầu vào là chữ cái
		if (Character.isLetter(c)) {
			// Chuyển đổi kí tự thành viết hoa để phù hợp với ALPHABET
			c = Character.toUpperCase(c);

			// Tìm vị trí của kí tự trong ALPHABET
			int index = -1;
			for (int i = 0; i < ALPHABET.length; i++) {
				if (ALPHABET[i] == c) {
					index = i;
					break;
				}
			}

			// Giải mã kí tự
			if (index != -1) {
				int decryptedIndex = (index - n + ALPHABET.length) % ALPHABET.length;
				return ALPHABET[decryptedIndex];
			}
		}
		// Trường hợp kí tự không thuộc ALPHABET hoặc không phải là chữ cái
		return c;
	}

	// Mã hóa một chuỗi văn bản theo số bước dịch đã cho
	public String encryptText(String text) {
		StringBuilder encryptedText = new StringBuilder();
		for (char c : text.toCharArray()) {
			encryptedText.append(encryptChar(c));
		}
		return encryptedText.toString();
	}

	// Giải mã một chuỗi văn bản theo số bước dịch đã cho
	public String decryptText(String text) {
		StringBuilder decryptedText = new StringBuilder();
		for (char c : text.toCharArray()) {
			decryptedText.append(decryptChar(c));
		}
		return decryptedText.toString();
	}

	public static void main(String[] args) {
		MyCaesar caesar = new MyCaesar(3); // Số bước dịch là 3

		// Mã hóa và giải mã kí tự
		char originalChar = 'A';
		char encryptedChar = caesar.encryptChar(originalChar);
		char decryptedChar = caesar.decryptChar(encryptedChar);

		System.out.println("Original Char: " + originalChar);
		System.out.println("Encrypted Char: " + encryptedChar);
		System.out.println("Decrypted Char: " + decryptedChar);

		// Mã hóa và giải mã chuỗi văn bản
		String originalText = "Thinh cute";
		String encryptedText = caesar.encryptText(originalText);
		String decryptedText = caesar.decryptText(encryptedText);

		System.out.println("Original Text: " + originalText);
		System.out.println("Encrypted Text: " + encryptedText);
		System.out.println("Decrypted Text: " + decryptedText);
	}
}