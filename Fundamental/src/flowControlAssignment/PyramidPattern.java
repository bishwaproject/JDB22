package flowControlAssignment;

public class PyramidPattern {
	public static void main(String[] args) {
		int size = 5;
		
		for(int i=1; i<=size; i++) {
			for(int j=1; j <=size-i; j++) {
				System.out.print(" "); //Printing space
			}
			for(int k = 1; k <=(2*i-1); k++) {//(2*i-1) first row * =1; second=3; third=5; 4th-7 and 5th 9
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
