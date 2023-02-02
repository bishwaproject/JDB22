package flowControlAssignment;

public class Question1 {
	void startSquar() {
		// 3 rows 5 columns
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<=5;j++) {
				System.out.print("* ");
			}	
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Question1 obj = new Question1();
		obj.startSquar();
	
	}

}
