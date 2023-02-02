package flowControlAssignment3;

public class OddorNot {
	boolean isOdd(int n) {
		if(n%2 == 0)
		return false;
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		int n = 50;
		//call isEven method
		OddorNot check = new OddorNot();
		boolean result = check.isOdd(n);
		if(result == true)
			System.out.println("Given number " + n + " is odd");
		else {
			System.out.println("Given number " + n + " is not odd");
		}
	}


}
