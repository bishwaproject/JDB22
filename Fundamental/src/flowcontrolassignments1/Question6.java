package flowcontrolassignments1;

import java.util.Scanner;

public class Question6 {
	
	void calculateInterestRate(String gender, int age) {
		/*DID NOT WORK INSTEAD OF USE == use equals("Male")
		 * if(gender == "Male" && age <= 60)
		 * System.out.println("Interest rate is: 9.23%");
		 * 
		 * if(gender == "Male" && age >60)
		 * System.out.println("Interest rate is: 9.23%");
		 * 
		 * if(gender == "Female" && age <= 58)
		 * System.out.println("Interest rate is: 8.2%");
		 * 
		 * if(gender == "Female" && age >59)
		 * System.out.println("Interest rate is: 7.6%");
		 */
		if(age<1 || age>120) {
			System.out.println("Enter valid age [Between 1-120]");
		}
		else if (gender.equalsIgnoreCase("Male") && age <= 60) 
			System.out.println("Interest rate is: 9.2%");
		
		else if(gender.equalsIgnoreCase("Male") && age >60)
			System.out.println("Interest rate is: 8.3%");
		
		else if(gender.equalsIgnoreCase("Female") && age <= 58) 
			System.out.println("Interest rate is: 8.2%");
		
		else if(gender.equalsIgnoreCase("Female") && age >59)
			System.out.println("Interest rate is: 7.6%");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the gender [Male or Female]: ");
		String gender = sc.next();
		System.out.print("Enter the age [Between 1-120]: ");
		int age = sc.nextInt();
		
		Question6 check = new Question6();
		check.calculateInterestRate(gender, age);
	}

}
