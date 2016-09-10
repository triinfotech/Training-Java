class Operators {
	public static void main(String[] args) {
		/**
 	     *  1. Arithemtic Operators
 	     *  + (Addition, Binary)
 	     *  - (Subtraction, Binary)
 	     *  * (Multiplication, B)
 	     *  / (Division, B)  num / den = 0 (num, den belongs to integers, num < den)
 	     *  % (Remainder, B) num % den = num (num < den)
 	     *  ++ (Increment, U : Pre, Post)
 	     *  -- (Decrement, U : Pre, Post)
 		 */	     		 

		byte a = (byte)19;
		byte b = (byte)20;
		byte c = (byte)(a % b);

		System.out.println(c);

		int d = 10;
		int e = d++; //Post-increment; First value will be used than increment

		System.out.println(d); //11
		System.out.println(e); //10

		e = ++d; //Pre-increment; First increment than use

		System.out.println(d); //12
		System.out.println(e); //12

		d = 25;
		e = 11;

		/**
		 * 2. Bitwise Operators
		 *
		 * & - Bitswise AND (B)
		 * | - Bitwise OR (B)
		 * ^ - Bitwise XOR (B)
		 * ~ - Bitwise NOT (U)
		 * << - Bitwise Shift Left (B)
		 * >> - Bitwise Shift Right (B)
		 *
		 *  11001
		 *  01011 ^
		 * -------
		 *  10010 = 18
		 * -------
		 *
		 * 
		 *  ~d = 24
		 *
		 *  d >> 2
		 *
		 */

		System.out.println(d >> 2);

		/**
		 * Relational Operators
		 *
		 * < Less than
		 * <= Less than or equals to
		 * > Greater than
		 * >= Greater than or equals to
		 * == Equals
		 * != Not Equals
		 *
		 */

		/**
		 * Logical Operators
		 *
		 * && AND
		 * || OR
		 * ! NOT
		 */

		boolean bo = !false;
		System.out.println(bo);

		/** 
		 * Conditional/Ternary operator
		 * op1 ? op2 : op3
		 */

		System.out.println((10 == 20) ? "10 is less than 20" : "10 is not less than 20");
	}
}