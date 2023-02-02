package flowcontrolassignments1;

import java.util.Scanner;

/*
 * Check if user-given number prime or not
 */
public class Question14 {
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
		int n = sc.nextInt();
		//calling isPrime method
		Question14 check = new Question14();
		boolean result = check.isPrime(n);
		if(n==1 || n==0) 
			System.out.println(n + " is neither prime nor composite");
		
		else if(result==true)
			System.out.println("Given number " + n +" is prime number");
		else {
			System.out.println("Given number " + n +" is not prime number");
		}
	}


}
