package Task;

public class Task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
	public static int getSn1(int n) {
		// TODO
		if (n == 1) {
			return n;
		} else {
			if (n % 2 == 0) {
				return -n + getSn1(n - 1);
			} else {
				return n + getSn1(n - 1);
			}
		}
	}

	// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
	public static int getSn2(int n) {
		// TODO
		if (n == 1) {
			return n;
		} else {
			return helpSn2(n) + getSn2(n - 1);
		}

	}

	public static int helpSn2(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * helpSn2(n - 1);
		}
	}

	// S(n)=1^2+2^2+3^2+....+n^2 , n>0
	public static int getSn3(int n) {
		// TODO
		if (n == 1) {
			return 1;
		} else {
			return (int) Math.pow(n, 2) + getSn3(n - 1);
		}
	}

	// S(n=)1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
		if (n == 0) {
			return 1;
		} else {
			double denominator = 1.0;
			for (int i = 1; i <= n; i++) {
				denominator *= 2 * i;
			}
			return 1 / denominator + getSn4(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(getSn1(6));
		System.out.println(getSn2(6));
		System.out.println(getSn3(6));
		System.out.println(getSn4(6));
	}

}
