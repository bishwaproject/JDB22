package flowcontrolassignments1;

import java.util.Scanner;

//Floyd format using while
public class Question16 {

	public static void main(String[] args) {
		//initialize first floyd
		int row = 1;
		int num = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int n = sc.nextInt();
		
		while(row <=n) {
			int col = 1;
			while(col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
