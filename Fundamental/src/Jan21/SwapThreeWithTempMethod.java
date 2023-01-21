package Jan21;

public class SwapThreeWithTempMethod {
	
	void swappingTask(int n1, int n2, int n3, int temp) {
		//Swapping task
		temp = n1;
		n1 = n2;
		n2 = n3;
		n3 = temp;
		
		
		System.out.println("After Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
	}
	public static void main(String[] args) {
		SwapThreeWithTempMethod swap = new SwapThreeWithTempMethod();
		int n1, n2, n3, temp;
		temp = 0;
		n1 = 100;
		n2 = 200;
		n3 = 300;
		System.out.println("Before Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
		
		//calling swappingTask()
		swap.swappingTask(n1, n2, n3, temp);
	
	
		
	}


}
