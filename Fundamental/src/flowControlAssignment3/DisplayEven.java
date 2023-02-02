package flowControlAssignment3;

public class DisplayEven {
	
	boolean isEven(int n) {
		if(n%2==0)
			return true;
		else {
			return false;
		}
	}
	void displayEven() {
		System.out.println("Even numbers [1-100] are: ");
		for(int i=1; i<= 100; i++) {
			if(isEven(i)) {
				System.out.print(i+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		DisplayEven printEven = new DisplayEven();
		printEven.displayEven();
	}

}
