package flowControlAssignment3;

public class DisplayPrime {
	
	boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}
	
	void displayPrime() {
		System.out.println("Prime numbers [1 - 100] are: ");
		 for(int i = 2; i <=100; i++) {
			 
			 if(isPrime(i)) {
				 
				 System.out.print(i + " ");
			 }
		 }
		
		}
	
	public static void main(String[] args) {
		DisplayPrime printEven = new DisplayPrime();
		printEven.displayPrime();
	}

}
