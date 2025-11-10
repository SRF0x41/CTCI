
public class problem1_9 {

    public static void main(String[] args) {
        /*String Rotation; Assume you have a method isSubstring which checks if one word is a substring
        of another. Given two strings, si and s2, write code to check if s2 is a rotation of si using only one
        call to isSubstring [e.g., " waterbottle " is a rotation o P 'erbottlewat" ) ,
        Hints: #34, #88,#W4 */


        if(args.length < 2){
            System.out.println("Not enough arguments");
            return;
        }

        String s1 = args[0];
        String s2 = args[1];

        System.out.println(Problem1_9(s1, s2));
        
    }

    public static boolean problem1_9_BF(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        return true;
    }


    public static boolean Problem1_9(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String doubled_s1 = s1 + s1;
        return isSubstring(doubled_s1, s2);
    }

    public static String RotateString(String str){
        StringBuilder rotated_string = new StringBuilder(str);
        int str_len = str.length();
        char c = rotated_string.charAt(str_len-1);
        rotated_string.deleteCharAt(str_len-1);
        rotated_string.insert(0, c);
        return rotated_string.toString();
    }

    public static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }
}
