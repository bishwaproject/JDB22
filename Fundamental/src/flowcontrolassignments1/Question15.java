package flowcontrolassignments1;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number you want to add: ");
		int total = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < total; i++) {
			System.out.print("Enter "+ (i+1) + " number: ");
			int num = sc.nextInt();
		//	sum = sum + num;
			sum+=num;
		}
		System.out.println("The sum of given number: "+ sum);
	}

}
