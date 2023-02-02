package flowcontrolassignments1;
//display color of associated code 
public class Question8 {
	static void checkColor(char code) {
		switch(code) {
		case 'R':
			System.out.println(code+"-> Red");
			break;
		case 'B':
			System.out.println(code+"-> Blue");
			break;
		case 'G':
			System.out.println(code+"-> Green");
			break;
		case 'O':
			System.out.println(code+"-> Orange");
			break;
		case 'Y':
			System.out.println(code+"-> Yellow");
			break;
		case 'W':
			System.out.println(code+"-> White");
			break;
		default:
			System.out.println("Invalid Code");
		
		}
	}

	public static void main(String[] args) {
		checkColor('R');
		checkColor('G');
		checkColor('B');
		checkColor('T');
		
	}


}
