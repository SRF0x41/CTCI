public class problem1_4 {
    /*Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin-
    drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
    is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
    EXAMPLE
    Input: T a c t Coa
    Output: True (permutations: "taco cat", "atco eta", etc.)
    Hints: #106, h 0134, § 136 */

    public static void main(String[] args){
	if(args.length == 0){
		System.out.println("No argument provided");
		return;
	}
        String input = args[0];

        System.err.println(Problem1_4_BF(input.toLowerCase()));


    }


    public static boolean Problem1_4_BF(String str){
        int[] char_lib = new int[256];
        int character_count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                int char_ascii = (int)str.charAt(i);
                if(char_lib[char_ascii] == 0){
                    char_lib[char_ascii] += 1;
                    character_count += 1;
                } else if(char_lib[char_ascii] == 1){
                    char_lib[char_ascii] -= 1;
                    character_count -= 1;
                }
            }
        }

	// for(int i = 0; i < char_lib.length; i++){
	// 	System.out.print((char)(i) + ":" + char_lib[i]);
	// }
	System.out.println("Mismatched Characters: (0 or 1 ensure a permutation) " + character_count);
        
        return !(character_count > 1);
    }
}
