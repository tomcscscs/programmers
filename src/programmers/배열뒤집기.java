package programmers;

import java.util.Arrays;

public class 배열뒤집기 {
	public int[] solution(int[] num_list) {
		int[] newNumList = new int[num_list.length];

		for (int i = 0; i < num_list.length; i++) {
			newNumList[num_list.length - i - 1] = num_list[i];

		}
		return newNumList;

	}

	public static void main(String[] args) {
		int[] ar = { 2, 3, 6 };

		배열뒤집기 i = new 배열뒤집기();

		int[] reverseArray = i.solution(ar);
		String reverseResult = "";// 문자열로 보기위해 결국에는 스트링 변수를 선언해줘야한다.

		for (int ri = 0; ri < reverseArray.length; ri++) {
			reverseResult += String.valueOf(reverseArray[ri]);

		}

		System.out.println(reverseResult);

	}

}
