package programmers.study;

public class 두수의연산값비교하기 {
	public int solution(int a, int b) {
		String fa = String.valueOf(a);
		String fb = String.valueOf(b);

		if (Integer.parseInt(fa + fb) > 2 * a * b) {
			return Integer.parseInt(fa + fb);

		}
		return 2*a*b;
	}

}