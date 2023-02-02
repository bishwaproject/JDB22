package flowcontrolassignments1;
/*
 * print number 1 to 10 in single row with one tab space
 */
public class Question10 {
	
	void printNumber() {
		for(int i = 1; i<=10; i++) {
			System.out.print(i+"\t");
		}
	}
	
	public static void main(String[] args) {
		Question10 print = new Question10();
		print.printNumber();
	}

}
