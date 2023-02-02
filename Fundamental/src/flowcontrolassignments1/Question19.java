package flowcontrolassignments1;
//print first 5 value which are divisible by 2,3and5
//using while loop
public class Question19 {
	
	public static void main(String[] args) {
		int i = 0;
		int n = 1;
		int r = 5; //(repeatation) first five print
		
		System.out.println("First " + r + " common number divisible by 2, 3 and 5 are: ");
		while(i < r) {
			if(n % 2 == 0 && n%3 == 0 && n%5 == 0) {
				System.out.print(n + " ");
				i++;
			}
			n++;
		}
	}
}
