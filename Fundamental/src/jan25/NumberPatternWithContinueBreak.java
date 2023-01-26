package jan25;
/* Print 1 5 10 15 in 4 column upto 100
 * [remember starting from 1 not 0]
 */

public class NumberPatternWithContinueBreak {

	public static void main(String[] args) {
		int k = 0;
		// if(k < 5){
		// System.out.print("1");
		// }
		for (int i = 0; i < 6; ++i) { // *used 6 rows here instead of 5
			for (int j = 0; j < 4; ++j) { // 4 size of columns
				if (k == 0) {
					k += 5;
					continue; // when if statement is true, it skips first iteration (e.g. 0)
				}
				if (k <= 5) {
					System.out.print(1 + " "); // when if condition is true it prints this line
				}
				System.out.print(k + " ");
				// k=k+2;
				k += 5;
				if (k > 101) {
					break;
				}
			}
			System.out.println();
		}
	}
}
/*--OUTPUT--
1 5 10 15 
20 25 30 35 
40 45 50 55 
60 65 70 75 
80 85 90 95 
100
*/
