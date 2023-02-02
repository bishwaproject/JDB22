package flowcontrolassignments1;

/*
 * Check given number prime or not
 */
public class Question12 {
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
		Question12 check = new Question12();
		boolean result = check.isPrime(n);
		if(result==true)
			System.out.println("Given number " + n +" is prime number");
		else {
			System.out.println("Given number " + n +" is not prime number");
		}
	}

}
