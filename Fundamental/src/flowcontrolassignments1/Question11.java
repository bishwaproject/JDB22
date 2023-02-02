package flowcontrolassignments1;
/*
 * print even number between 23 to 57
 */
public class Question11 {
	boolean isEven(int n) {
		if (n % 2 == 0)
			return true;
		else {
			return false;
		}
	}

	void displayEven() {
		System.out.println("Even numbers [23-57] are: ");
		for (int i = 23; i <= 57; i++) {
			if (isEven(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Question11 printEven = new Question11();
		printEven.displayEven();
	}
}
