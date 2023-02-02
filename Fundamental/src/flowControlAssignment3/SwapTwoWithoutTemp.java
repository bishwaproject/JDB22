package flowControlAssignment3;

public class SwapTwoWithoutTemp {
	void swappingTask(int n1, int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After Swapping: ");
		System.out.println("N1 = "+ n1);
		System.out.println("N2 = "+ n2);
	}
	
	public static void main(String[] args) {
		int n1, n2;
		n1 = 100;
		n2 = 200;
		
		System.out.println("Before Swapping: ");
		System.out.println("N1 = "+ n1);
		System.out.println("N2 = "+ n2);
		
		//calling swap method in main
		SwapTwoWithoutTemp swap = new SwapTwoWithoutTemp();
		swap.swappingTask(n1, n2);
	}

}
