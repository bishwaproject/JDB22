package flowControlAssignment;
/*
 Expected Output:
 *****
 ****
 ***
 **
 *
 *
 *Tips: columns are decreasing once rows are increasing so, compare with i and j
 *i starting from 0; j starting from 5
 */

public class Question2 {
	
	void startPrint() {
		//rows 5 columns 5;
		for(int i = 0; i<5; i++) {
			for(int j = 5; j>i; j--) { //*
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Question2 obj = new Question2();
		obj.startPrint();
	}

}
