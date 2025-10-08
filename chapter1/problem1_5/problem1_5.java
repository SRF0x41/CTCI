
public class problem1_5 {

    /*One Away: There are three types of edits that can be performed on strings: insert a character,
	remove a character, or replace a character. Given two strings, write a function to check if they are
	one edit (or zero edits) away.
	EXAMPLE
	pale, pie -> true
	pales, pale -> true
	pale, bale -> true
	pale, bake -> false
	Hints: #23, #97, it 130*/
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided");
            return;
        }

        String word1 = args[0];
        String word2 = args[1];

        System.out.println(problem1_5BF1(word1, word2));

    }

    public static boolean problem1_5BF1(String a, String b) {
        int lena = a.length();
        int lenb = b.length();

		if(Math.abs(lena - lenb) > 1){
			return false;
		}

        int counta = 0;
        int countb = 0;

        int mismatch = 0;

        if (lena == lenb) {
            for (int i = 0; i < lena; i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    mismatch += 1;
                }
                if (mismatch > 1) {
                    return false;
                }
            }
        } else {
            int min_len = Math.min(lena, lenb);
            for (int i = 0; i < min_len; i++) {
                if (a.charAt(counta) == b.charAt(countb)) {
                    counta++;
                    countb++;
                } 
				else
                if (a.length() > b.length()) {
                    counta += 1;
                    mismatch += 1;
                } else {
                    countb += 1;
                    mismatch += 1;
                }

                if (mismatch > 2) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean problem1_5BF(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();

        if (Math.abs(len1 - len2) > 1) {
            return false;
        }

        int counta = 0;
        int countb = 0;

        int min_len = Math.min(len1, len2);
        int mismatch = 0;

        for (int i = 0; i < min_len; i++) {
            if (a.charAt(counta) == b.charAt(countb)) {
                counta += 1;
                countb += 1;
            } else if (a.length() == b.length()) {
                mismatch += 1;
                counta += 1;
                countb += 1;
            } else if (a.length() > b.length()) {
                counta += 1;
                mismatch += 1;
            } else {
                countb += 1;
                mismatch += 1;
            }

            if (mismatch > 1) {
                return false;
            }
        }
        return true;
    }
}
