package programmers;

public class 문자배열뒤집기 {

	public String solution(String my_string) {

		char[] charArray = my_string.toCharArray();
		
		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - i - 1];
			charArray[charArray.length - i - 1] = temp;
		}

		/*
		 * for (int i = 0; i < my_string.length() / 2; i++) { char temp = charArray[i];
		 * charArray[i] = charArray[my_string.length() - i - 1];
		 * charArray[my_string.length() - i - 1] = temp;
		 */

		return new String(charArray);
	}
}
