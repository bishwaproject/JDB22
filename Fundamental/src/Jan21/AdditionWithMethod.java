package Jan21;

public class AdditionWithMethod {
	
	void addition(int n1,  int n2) {
	int result = n1 + n2;
	System.out.println("Addition of " + n1 +" and "+ n2 + " is " + result);
	}
	

		public static void main(String[] args) {
			AdditionWithMethod add = new AdditionWithMethod();
			add.addition(4,8);
	}

}
