package flowcontrolassignments1;

import java.util.Scanner;

public class Question3 {
	public void checkValue() {
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		String[] arr = new String[5];
		//getting value as array
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter some name of cities: ");
			 name = sc.next();
			 arr[i] = name;
		}
		if(name == null) {
			System.out.println("You did not enter anything: ");
			}
		else {
			for(String list: arr) {
				System.out.print(list+", ");
			}
		}
	}
}
