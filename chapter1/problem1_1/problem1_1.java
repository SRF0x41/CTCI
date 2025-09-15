public class problem1_1 {
    public static void main(String[] args) {
	/*
	 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
	cannot use additional data structures?
	Hints: #44, #117, #132
	*/

	System.out.println(isUnique(args[0]));

	}

	public static boolean isUnique(String word){
		boolean[] characters = new boolean[256];

		for(int i = 0; i < word.length(); i++){
			if (characters[(int)word.charAt(i)]){
				return false;
			}
			characters[(int)word.charAt(i)] = true;
		}
		return true;
	}
}

