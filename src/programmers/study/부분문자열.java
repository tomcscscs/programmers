package programmers.study;

public class 부분문자열 {
	 public int solution(String str1, String str2) {
		 
		 for(int i =0; i < str2.length() -str1.length(); i++) {
			 boolean found = true;
			 
			 for(int z =0; z <str1.length(); z++) {
				 if(str2.charAt(i+z) != str1.charAt(z)) {
					found = false;
					break;
					
					 
				 }
			 }
			 if(found) {
				 return 1;
			 }
			 
		 }
		 return 0;
	        
	    }
	

}
