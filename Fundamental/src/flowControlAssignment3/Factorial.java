package flowControlAssignment3;

public class Factorial {
	static int factorial(int n) {
		int result = 1; //factorial !0 = 1 
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int result = factorial(5);
		int result1 = factorial(6);
		
		System.out.println("Factorial of 5: "+ result);
		System.out.println("Factorial of 6: "+ result1);
	}

}
