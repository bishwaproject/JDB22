package Jan21;

public class StudentWithMethod {
	void studentInfo(int id, String fname, String lname, String address) {
		System.out.println("---DETAIL OF STUDENT---");
		System.out.println("_____________________");
		System.out.println("ID: " + id);
		System.out.println("First Name: " + fname);
		System.out.println("Last Name: " + lname);
		System.out.println("Address: " + address);
	}
	public static void main(String[] args) {
		StudentWithMethod info = new StudentWithMethod();
		info.studentInfo(101,"Tool","Mack","New York");
		
	}

}
