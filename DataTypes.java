class DataTypes {
	public static void main(String[] args) {
		/** Integers
         *  
         *  1. byte: 1B/8b, -2^7 to 2^7-1
         *  2. short: 2B/16b, -2^15 to 2^15-1
         *  3. int: 4B/32b, -2^31 to 2^31-1
         *  4. long: 8B/64b, -2^63 to 2^63-1
		 *
		 *  Floating-Points
		 *
		 *  1. float: 4B/32b, -3.4X10^38 to 3.4X10^38 (IEEE 754 Standard)
		 *  2. double: 8B/64B,-1.7X10^308 to 1.7X10^308 (IEEE 754 Standard)
		 *
		 *  Character
		 * 				
	     *  1. char, 2B/16b, 0-2^15
		 *
 	     *  Boolean
 	     * 
 	     *  1. boolean, 1B/8b, {false, true}
 	     *
 	     *
         */

		char c = '\u0A13';
		System.out.println(c);
	}
}