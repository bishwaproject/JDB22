package flowcontrolassignments1;
//convert char from upper case to lower case and vice versa
public class Question7 {
	static void changeCase(char original) {
		//first check upper or lower case then convert:
		if(Character.isUpperCase(original))
			System.out.println(original+"->"+Character.toLowerCase(original));
		else {
			System.out.println(original+"->"+Character.toUpperCase(original));
		}
	}
	
	public static void main(String[] args) {
		changeCase('A');
		changeCase('m');
		changeCase('Z');
		changeCase('t');
	}

}
