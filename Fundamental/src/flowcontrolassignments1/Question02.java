package flowcontrolassignments1;

public class Question02 {
	
	void checkNumber(int n) {
		if(n%2==0) {
			System.out.println(n + " is Even number.");
		}
		else {
			System.out.println(n + " is Odd number.");
		}
	}
	
	public static void main(String[] args) {
		int n = 0;
		Question02 check = new Question02();
		check.checkNumber(n);
	}

}
