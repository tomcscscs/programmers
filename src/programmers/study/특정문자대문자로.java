package programmers.study;

public class 특정문자대문자로 {
	  public static String solution(String my_string, String alp) {
	        StringBuilder result = new StringBuilder();

	        for (char c : my_string.toCharArray()) {
	            if (String.valueOf(c).equals(alp)) {
	                result.append(Character.toUpperCase(c));
	            } else {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }

}
