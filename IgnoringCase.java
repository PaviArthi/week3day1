package assignments;

public class IgnoringCase {

	public static void main(String[] args) {
		
		String str1 = "I am Learning Java";
		String str2 = "I am Learning Java";
		if (str1 == str2) {
			System.out.println("Same string");
		}

		else if (str1.equals(str2)) {
			System.out.println("Equals case");
			System.out.println("Same string");
		}

		else if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Equals ignorecase");
			System.out.println("Same string");
		}

		else
			System.out.println("Different String");
	}

}
