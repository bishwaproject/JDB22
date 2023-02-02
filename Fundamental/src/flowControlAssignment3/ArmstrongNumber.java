package flowControlAssignment3;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		//Understanding plain mathmatics of armstrong number is important here;
	//	int number = 120;
		int number = 153;
		int originalNumber = number;
		int result = 0;
		int n;
		
		while(originalNumber!=0) {
			int remainder = originalNumber % 10;
			result += Math.pow(remainder, String.valueOf(number).length()); //String.valueof(number).length gives the length of numbers i.e. 3 for 153
			originalNumber = originalNumber/10;
		}
		if(result==number) {
			System.out.println(number + " number is: Armstrong Number" );
		}
		else {
			System.out.println(number + " number is:Not Armstrong Number" );
		}
	}

}
