package flowcontrolassignments1;
/*
 * Display prime number 10 - 99
 */
public class Question13 {
	boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
				}
			}
		return true;
	}
	
	void displayPrime() {
		System.out.println("Even numbers [10-99] are: ");
		for (int i = 10; i <= 99; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Question13 print = new Question13();
		print.displayPrime();
	}

}
