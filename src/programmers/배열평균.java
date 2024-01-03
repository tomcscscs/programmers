package programmers;

public class 배열평균 {
	public double solution(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}
		double avg = sum / numbers.length;
		return avg;

	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 6 };
		배열평균 avg = new 배열평균();
		double result = avg.solution(ar);

		System.out.println(result);

	}

}
