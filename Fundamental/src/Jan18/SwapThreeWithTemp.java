package Jan18;
public class SwapThreeWithTemp {

	public static void main(String[] args) {
		int n1, n2, n3, temp;
		n1 = 100;
		n2 = 200;
		n3 = 300;
		System.out.println("Before Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
		
		//Swapping task
		temp = n1;
		n1 = n2;
		n2 = n3;
		n3 = temp;
		
		
		System.out.println("Before Swapping: ");
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("N3 = " + n3);
	
		
	}

}

