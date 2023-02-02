package flowControlAssignment3;

public class SwapThreeWithoutTemp {
	void swappingTask(int n1, int n2, int n3) {
		n1 = n1 + n2 + n3; 
		n3 = n1 - n2 - n3;
		n2 = n1 - n2 - n3; 
		n1 = n1 - n2 - n3;
		System.out.println("After Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
	}

	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = 100;
		n2 = 200;
		n3 = 300;
		System.out.println("Before Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
		
		//call swappingTask()
		SwapThreeWithoutTemp swap = new SwapThreeWithoutTemp();
		swap.swappingTask(n1, n2, n3);
	
		
	}


}
