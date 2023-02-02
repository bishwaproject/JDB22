package flowcontrolassignments1;
/*
 * Find palindrome or not
 * We already have Reverse Method (Question17, so it will be easy with help of that)
 */
public class Question18 {
	static int n; //use case of instance variable, not require to initialize 
	
	static int reverse(int n) {
		//to understand how reverse works in plain mathematics is important here.
		//Finding last digit and adding them in last.
		int reversed = 0;
		while(n != 0) {
			int lastDigit = n % 10;
			reversed = reversed * 10 + lastDigit;
			n = n/10;
		}
		return reversed;
	}
	
	void checkPalindrom(int n) {
		 //n = 0; //use case of instance variable here
		if(reverse(n) == n) {
			System.out.println("Given number "+  n  +" is palindrome");
		}
		else {
			System.out.println("Given number "+  n  +" is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		Question18 obj = new Question18();
		int check_number = 101;
		obj.checkPalindrom(check_number);
	}

}
