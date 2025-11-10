import java.util.HashSet;
public class problem1_2 {
	public static void main(String[] args) {
	/*
    Check Permutation: Given two strings, write a method to decide if one is a permutation of the
    other.
    Hints: f t , #84, #122, #131
	*/

	if(args.length == 0){
		System.out.println("No arguments provided");
		return;
	}

	//System.out.println(CheckPermutation_1(args[1],args[1]));
	System.out.println(CheckPermutation_2(args[0],args[1]));
	System.out.println(CheckPermutation_3(args[0],args[1]));
	
	}
	
	public static boolean CheckPermutation_1(String word1, String word2){
		// Does not work, eat and dog are not permutations
		if(word1.length() != word2.length()) return false;
		
		int word_len = word1.length();
		int ascii_sum = 0;
		for(int i = 0; i < word_len; i++){
			ascii_sum += (int)word1.charAt(i) - (int)word2.charAt(i);
		}
		
		if(ascii_sum == 0){
			return true;
		}
		return false;
	}	
	
	public static boolean CheckPermutation_2(String word1, String word2){
		if(word1.length() != word2.length()) return false;
		
		int[] character_array = new int[256];
		int word_len = word1.length();
			
		for(int i = 0; i < word_len; i++){
			character_array[(int)word1.charAt(i)] += 1;
			character_array[(int)word2.charAt(i)] -= 1;
		}
		
		for(int i = 0; i < character_array.length; i++){
			if(character_array[i] != 0){
				return false;
			}
		}
		return true;
	}

	public static boolean CheckPermutation_3(String word1, String word2){
		if(word1.length() != word2.length()) return false;
	
		HashSet<Character> character_set = new HashSet<>();
		for(int i = 0; i < word1.length(); i++){
			char char1 = word1.charAt(i);
			char char2 = word2.charAt(i);

			if(char1 != char2){
				if(character_set.contains(char1)){
					character_set.remove(char1);
				} else {
					character_set.add(char1);
				}

				if(character_set.contains(char2)){
					character_set.remove(char2);
				} else {
					character_set.add(char2);
				}
			}

		}
		
		return character_set.size() == 0;
	}
}
