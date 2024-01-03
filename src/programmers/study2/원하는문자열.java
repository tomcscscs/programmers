package programmers.study2;

public class 원하는문자열 {
	 public static int solution(String myString, String pat) {
	        // 대소문자 구분 없이 비교하기 위해 소문자로 변환
	        myString = myString.toLowerCase();
	        pat = pat.toLowerCase();

	        // 부분 문자열이 존재하는지 확인
	        return myString.contains(pat) ? 1 : 0;
	    }
	

}
