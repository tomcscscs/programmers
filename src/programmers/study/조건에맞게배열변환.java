package programmers.study;

public class 조건에맞게배열변환 {
	 public static int[] solution(int[] arr) {
	        int[] result = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] >= 50 && arr[i] % 2 == 0) {
	                // 50보다 크거나 같은 짝수라면 2로 나누기
	                result[i] = arr[i] / 2;
	            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
	                // 50보다 작은 홀수라면 2를 곱하기
	                result[i] = arr[i] * 2;
	            } else {
	                // 나머지 경우는 그대로 유지
	                result[i] = arr[i];
	            }
	        }

	        return result;
	    }

	
	

}
