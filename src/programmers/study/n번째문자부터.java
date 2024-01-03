package programmers.study;

public class n번째문자부터 {
	public static int[] solution(int[] num_list, int n) {
		// 예외 처리: n이 num_list의 길이보다 크거나 같으면 빈 배열 반환
		if (n > num_list.length) {
			return new int[0];
		}

		// 반환할 부분 배열의 크기 계산
		int length = num_list.length - n + 1;

		// 새로운 배열 생성
		int[] answer = new int[length];

		// 주어진 배열의 n번째 원소부터 마지막 원소까지 새로운 배열에 복사
		for (int i = 0; i < length; i++) {
			answer[i] = num_list[n - 1 + i];
		}

		return answer;
	}

}
