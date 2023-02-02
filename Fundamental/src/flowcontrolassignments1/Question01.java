package flowcontrolassignments1;

public class Question01 {
	
	void checkNumber(int n) {
		if(n > 0) {
			System.out.println(n + " is Positive number.");
		}
		else if(n == 0) {
			System.out.println(n + " is Zero number.");
		}
		else {
			System.out.println(n + " is Negative number.");
		}
	}
	
	public static void main(String[] args) {
		int n = 0;
		Question01 check = new Question01();
		check.checkNumber(n);
	}

}
