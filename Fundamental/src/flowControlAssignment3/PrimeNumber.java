package flowControlAssignment3;

public class PrimeNumber {
	
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
	
	public static void main(String[] args) {
		int n = 5;
		//calling isPrime method
		PrimeNumber check = new PrimeNumber();
		boolean result = check.isPrime(n);
		if(result==true)
			System.out.println("Given number " + n +" is prime number");
		else {
			System.out.println("Given number " + n +" is not prime number");
		}
	}

}
