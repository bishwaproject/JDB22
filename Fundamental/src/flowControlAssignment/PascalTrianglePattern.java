package flowControlAssignment;

public class PascalTrianglePattern {

	public static void main(String[] args) {
		//Printing pascal number need to review again
		//All pattern need to review again.
		
		int size = 5;
		for(int i=0; i<size; i++) {
			int num = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i-j)/(j + 1);
			}
			System.out.println();
		}
	}
}
