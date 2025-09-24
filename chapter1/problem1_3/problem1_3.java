
public class problem1_3 {

	/*URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
	has sufficient space at the end to hold the additional characters, and that you are given the "true"
	length of the string. (Note: If implementing in Java, please use a character array so that you can
	perform this operation in place.)

	EXAMPLE
	Input: "Mr 3ohn S m i t h 13
	Output: "Mr%203ohn%20Smith"
	Hints: #53,0118*/

	public static void main(String[] args){
		// This is for spliting the std in from urlify pre program 
		String[] arg_split = args[0].split("\\R");

		String str_input = arg_split[0];
		int true_length = Integer.parseInt(arg_split[1]);

		System.out.println("Input String: " + str_input);
		System.out.println("True Length: " + true_length);

		System.out.println(URLify_BF(str_input, true_length));
		System.out.println(URLify_1(str_input, true_length));

	}
	
	public static String URLify_BF(String str, int length){
		char[] str_arr = new char[str.length()];
		int str_arr_count = 0;
		for(int i = 0; i < length; i++){
			if(str.charAt(i) == ' '){
				str_arr[str_arr_count] = '%';
				str_arr[str_arr_count+1] = '2';
				str_arr[str_arr_count+2] = '0';
				str_arr_count += 3;
			} else {
				str_arr[str_arr_count] = str.charAt(i);
				str_arr_count += 1;
			}
		}
		return new String(str_arr);
	}

	public static String URLify_1(String str, int true_len){
		// Go backwards
		char[] str_arr = StrArr(str); // Just converts the string to a char arr
		int exp_len = str.length();

		int index_last = exp_len - 1;

		int line_diff = exp_len - true_len;

		for(int i = exp_len - line_diff - 1; i > 0; i--){
			char c = str_arr[i];
			//System.out.println(c);
			if(c == ' '){
				str_arr[index_last] = '0';
				str_arr[index_last-1] = '2';
				str_arr[index_last-2] = '%';
				index_last -= 3;
			} else {
				str_arr[index_last] = c;
				index_last -= 1;
			}
		}
		return new String(str_arr);

	}

	public static char[] StrArr(String str){
		char[] charArr = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			charArr[i] = str.charAt(i);
		}
		return charArr;
	}

		
}
