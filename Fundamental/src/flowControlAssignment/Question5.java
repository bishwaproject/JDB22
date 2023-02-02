package flowControlAssignment;
/*
Expected output
11111
22222
33333
44444
55555
 */
public class Question5 {
	
	void printPattern() {
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j< 5; j++) {
				System.out.print(k);
			}
			k++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Question5 obj = new Question5();
		obj.printPattern();
	}

}
