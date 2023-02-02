package flowControlAssignment;

public class Question8 {
	void printPattern() {
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j<=6; j++) {
				if(k<=50)
				System.out.print(k + " ");
				k+=2;
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Question8 obj = new Question8();
		obj.printPattern();
	}

}
