package flowControlAssignment3;

public class EvenorNot {
	
	boolean isEven(int n) {
		if(n%2 == 0)
		return true;
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int n = 51;
		//call isEven method
		EvenorNot check = new EvenorNot();
		boolean result = check.isEven(n);
		if(result == true)
			System.out.println("Given number " + n + " is even");
		else {
			System.out.println("Given number " + n + " is not even");
		}
	}

}
