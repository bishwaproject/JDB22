package flowcontrolassignments1;
//Reverse the number
public class Question17 {
	
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
	
	public static void main(String[] args) {
		Question17 obj = new Question17();
		int r = obj.reverse(127);
		System.out.println(r);
	}

}
