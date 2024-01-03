package programmers.study;

public class 접미사인지확인하기 {

	public int solution(String my_string, String is_suffix) {
		// is_suffix의 길이가 my_string보다 길 경우에는 접미사가 될 수 없음
		if (is_suffix.length() > my_string.length()) {
			return 0;
		}

		// my_string에서 뒤에서부터 is_suffix 길이만큼의 부분 문자열을 추출
		String suffixCandidate = my_string.substring(my_string.length() - is_suffix.length());

		// 추출한 부분 문자열과 is_suffix를 비교하여 같으면 1, 다르면 0 반환
		return suffixCandidate.equals(is_suffix) ? 1 : 0;
	}

}
