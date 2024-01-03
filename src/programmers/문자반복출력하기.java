package programmers;

public class 문자반복출력하기 {
	public String solution(String my_string, int n) {

		String result = "";

		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				result += my_string.charAt(i);
			}
		}

		return result;

	}

}
