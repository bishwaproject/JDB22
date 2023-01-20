package Jan19;

public class NullPointerException {
	
	void test() {
		
	}

	public static void main(String[] args) {
		// NullPointerException obj = new NullPointerException();
		NullPointerException obj = null;
		obj.test();
		
/* Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Jan19.NullPointerException.test()" because "obj" is null
	at Jan19.NullPointerException.main(NullPointerException.java:12)
*/
		



	}

}
