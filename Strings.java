class Strings {
	public static void main(String[] args) {
		char[] ch = {'\u0A05', '\u0A1C', '\u0A47'};

		// String creation
		String str = new String(ch);
		String st = "Hey dear!";
		System.out.println(st);
		System.out.println(str);

		// To get a character from a string
		System.out.println(str.charAt(1));
		
		// Convert to upper case
		String someString = "This is a sentence case but would be upper case on an execution.";
		someString = someString.toUpperCase();
		System.out.println(someString);

		// Convert to lower case
		someString = someString.toLowerCase();
		System.out.println(someString);

		// Is word present in the string?
		System.out.println(someString.contains("upper"));
		
		// Last index of a word
		System.out.println(someString.lastIndexOf("a"));

		// Compare two string
		String str1 = "              Hello";
		String str2 = "HElLo";

		System.out.println(str1.compareTo(str2));

		// Check whether two strings are equal
		System.out.println(str1.equals(str2));

		// Check whether two strings are equal (ignore case)
		System.out.println(str1.equalsIgnoreCase(str2));

		// Trim spaces
		str1 = str1.trim();
		System.out.println(str1.equalsIgnoreCase(str2));

	}
}