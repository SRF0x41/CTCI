public class problem1_6 {

    /*String Compression: Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3, If the
    "compressed" string would not become smaller than the original string, your method should return
    the original string. You can assume the string has only uppercase and lowercase letters (a - z).
    Hints: #92, if 110*/

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("No arguments provided ");
            return;
        }

        System.out.println(problem1_6_BF(args[0]));

    }

    public static String problem1_6_BF(String a){
        if(a.length() == 1){
            return a;
        }

        int original_len = a.length();

        char c = a.charAt(0);

        String compressed_string = "";
        int char_count = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == c){
                char_count++;
            } else {
                compressed_string += c + Integer.toString(char_count);
                c = a.charAt(i);
                char_count = 1;

                if(compressed_string.length() > original_len){
                    return a;
                }
            }
        }
        compressed_string += c + Integer.toString(char_count);
        return compressed_string;
    }

}