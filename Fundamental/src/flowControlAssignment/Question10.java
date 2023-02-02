package flowControlAssignment;

public class Question10 {
	//char k = 'a';
	void printPattern() {
		for(int i = 0; i< 3; i++) {
			for(char j = 'a'; j<= 'f'; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Question10 obj = new Question10();
		obj.printPattern();
	}

}
