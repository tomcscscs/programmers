package programmers.study;

public class 부분문자열확인하기 {
	public int solution(String my_string, String target) {
	    if (my_string.length() < target.length()) {
	        return 0;  // target이 더 길면 부분 문자열이 될 수 없음
	    }

	    for (int i = 0; i <= my_string.length() - target.length(); i++) {
	        boolean found = true;

	        for (int z = 0; z < target.length(); z++) {
	            if (my_string.charAt(i + z) != target.charAt(z)) {
	                found = false;
	                break;
	            }
	        }

	        if (found) {
	            return 1;  // target이 부분 문자열인 경우
	        }
	    }

	    return 0;  // target이 부분 문자열이 아닌 경우
	}


}
