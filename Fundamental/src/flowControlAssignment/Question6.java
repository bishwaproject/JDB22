package flowControlAssignment;

public class Question6 {
	void printPattern() {
		for(int i = 0; i< 4; i++) {
			for(int j = 1; j<= 5; j++) {
				System.out.print(j);
				//j++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Question6 obj = new Question6();
		obj.printPattern();
	}
		

}
