package flowcontrolassignments1;

/*
 * Display month name associated with number
 */
public class Question9 {
	static void printMonth(int num) {
		switch (num) {
		case 1:
			System.out.println(num + "-> January");
			break;
		case 2:
			System.out.println(num + "-> February");
			break;
		case 3:
			System.out.println(num + "-> March");
			break;
		case 4:
			System.out.println(num + "-> April");
			break;
		case 5:
			System.out.println(num + "-> May");
			break;
		case 6:
			System.out.println(num + "-> June");
			break;
		case 7:
			System.out.println(num + "-> July");
			break;
		case 8:
			System.out.println(num + "-> August");
			break;
		case 9:
			System.out.println(num + "-> September");
			break;
		case 10:
			System.out.println(num + "-> October");
			break;
		case 11:
			System.out.println(num + "-> November");
			break;
		case 12:
			System.out.println(num + "-> December");
			break;
		default:
			System.out.println("Invalid Month");

		}
	}

	public static void main(String[] args) {
		printMonth(1);
		printMonth(5);
		printMonth(8);
		printMonth(18);

	}

}
