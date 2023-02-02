package flowControlAssignment;

/*
 Expected Output:
 *
 **
 ***
 ****
 *****
 *
 *Tips: columns are decreasing once rows are increasing so, compare with i and j
 *i starting from 0; j starting from 5
 */
public class Question3 {
	
			void startPrint() {
			//rows 5 columns 5; no row increase column increase
			
			for(int i = 0; i<5; i++) {
				for(int j = 0; j<=i; j++) { //*
					System.out.print("*");
					
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			Question3 obj = new Question3();
			obj.startPrint();
		}

	


}
