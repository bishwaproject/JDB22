package flowcontrolassignments1;

import java.util.Scanner;

public class Question20 {
	static String option ;
	
	public static void main(String[] args) {
		
		
		Scanner sc  = new Scanner(System.in);
		int fn = 0;
		int sn = 0;
		
				
		do {
			System.out.println("Option 1: [ADD]");
			System.out.println("Option 2: [SUBTRACT]");
			int choice = sc.nextInt();

			if(choice == 1) {
				System.out.print("Enter first Number: ");
				fn = sc.nextInt();
				System.out.print("Enter Second Number: ");
				sn = sc.nextInt();
				System.out.println("Total is: " + (fn+sn));
			}
			else if(choice == 2) {
				System.out.print("Enter first Number: ");
				fn = sc.nextInt();
				System.out.print("Enter Second Number: ");
				sn = sc.nextInt();
				System.out.println(" Subtraction is: " + (fn-sn));
			}
		System.out.println("Do you want to continue: Enter Y if Yes");
		option = sc.next();
		}while(option.equalsIgnoreCase("y"));
		System.out.println("Thank you for using the app");
	
	}

}
