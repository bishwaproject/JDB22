package Jan19;

public class StackoverflowExceptionEx {
	
	void test() {
		System.out.println("Hello");
		test();
	}

	public static void main(String[] args) {
		StackoverflowExceptionEx obj = new StackoverflowExceptionEx();
		obj.test();
		
		//Output: Exception in thread "main" java.lang.StackOverflowError
	}

}
