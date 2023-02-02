package flowControlAssignment;

/*
 * Same as:
 * *
 * **
 * ***
 * ****
 * ***** where instead of * print k=1 and k++;
 */
public class FloydsTriangle {
	void printPattern() {
		int k = 1;
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= i; j++) { // *
				System.out.print(k);
				k++;

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		FloydsTriangle obj = new FloydsTriangle();
		obj.printPattern();
	}

}
