package flowControlAssignment;

public class Question7 {
	void printPattern() {
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j<=10; j++) {
				System.out.print(k + " ");
				k++;
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Question7 obj = new Question7();
		obj.printPattern();
	}

}
