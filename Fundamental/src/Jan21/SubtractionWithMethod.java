package Jan21;

public class SubtractionWithMethod {
	void subtraction(int n1, int n2) {
		int result = n1 - n2;
		System.out.println("Subtraction of " + n1 + " and " + n2 + " is " + result);
	}

	public static void main(String[] args) {
		SubtractionWithMethod sub = new SubtractionWithMethod();
		sub.subtraction(10, 8);
	}

}
