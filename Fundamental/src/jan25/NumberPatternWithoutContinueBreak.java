package jan25;

public class NumberPatternWithoutContinueBreak {
	public static void main(String[] args) {
		int k = 0;
		/* [without continue and break keyword]
		 *s we need one more variable (total 4) only for printing 1
		 * We can have any name like h, i, j, k or l or anything
		 * I used tricky just to remember this code, when i come back and look on it ;)
		 */
		int tricky = 1;
		
		for (int i = 0; i < 6; ++i) { //to print 100 it requires 6 number of rows
			for(int j = 0; j < 4; ++j) { //4 number of column
				
				//Solving tricky part
				if(tricky==1) {
					System.out.print(tricky+ " ");
					tricky++; //Increment tricky by +1, so if condition become false, in next iteration
				}
				//tricky part finished
				
				if(k!=0 && k <= 100) //now need to skip k == 0 and k > 100
					System.out.print(k+ " ");
					k+=5;
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
