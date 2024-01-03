package programmers;

public class 두수의평균구하기 {
	public double solution(int[] numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}

		double avg = sum / numbers.length;

		return avg;

	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		두수의평균구하기 averageResult = new 두수의평균구하기();
		double avg = averageResult.solution(ar);

		System.out.println(avg);
	}

}
