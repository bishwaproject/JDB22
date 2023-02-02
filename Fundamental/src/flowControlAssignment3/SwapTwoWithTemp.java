package flowControlAssignment3;

public class SwapTwoWithTemp {
	
	void swappingTask(int n1, int n2, int temp) {
		//Swapping task
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("After Swapping: ");
		System.out.println("N1 = "+ n1);
		System.out.println("N2 = "+ n2);
	}
	
	public static void main(String[] args) {
		SwapTwoWithTemp swap = new SwapTwoWithTemp();
		int n1, n2, temp;
		temp = 0;
		n1 = 100;
		n2 = 200;
		System.out.println("Before Swapping: ");
		System.out.println("N1 = "+ n1);
		System.out.println("N2 = "+ n2);
		
		//calling swap method in main
		swap.swappingTask(n1, n2, temp);
	}

}
