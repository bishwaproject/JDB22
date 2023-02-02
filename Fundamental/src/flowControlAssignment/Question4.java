package flowControlAssignment;

public class Question4 {
	void printPattern() {
		for(int i = 1; i <= 4; i++) {
			if(i==1 || i == 4) {
				System.out.println("@@@@@");
			}
			else {
				System.out.println("@   @"); 
			}
		}
	}
	public static void main(String[] args) {
		Question4 obj = new Question4();
		obj.printPattern();
	}
}
