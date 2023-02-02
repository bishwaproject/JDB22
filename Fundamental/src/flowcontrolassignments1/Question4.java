package flowcontrolassignments1;

public class Question4 {
	void orderChar(char a, char b) {
		if(a<b) {
			System.out.println(a+"" +b);
		}
		if(a>b){
			System.out.println(b+"" +a);
		}
	}
	public static void main(String[] args) {
		char a = 's';
		char b = 'e';
		Question4 order = new Question4();
		order.orderChar(a, b);
	
	}
}
