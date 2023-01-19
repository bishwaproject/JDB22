package Jan18;

public class SwapThreeWithoutTemp {

	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = 100;
		n2 = 200;
		n3 = 300;
		System.out.println("Before Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
		
		//Swapping task
		n1 = n1 + n2 + n3; 
		n3 = n1 - n2 - n3;
		n2 = n1 - n2 - n3; 
		n1 = n1 - n2 - n3;
		System.out.println("Before Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
	
		
	}

}
