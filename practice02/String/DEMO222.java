package practice02.String;

public class DEMO222 {
    public static int countWords(String str) {
		int len = str.length(); 
		int start = 0; 
		int end = 0; 
		int cnt = 0; 
		boolean isWord = false; 
		
		while(start<len && end<len) {
			while(start<len && str.charAt(start) == ' ') {
				start++; 
			}
			end = start; 
			isWord = false; 
			
			while(end<len && str.charAt(end) != ' ') {
				end++; 
				isWord = true; 
			}
			
			if(isWord) {
				cnt++; 
			}
			start = end; 
		}
		
		
		return cnt;  
	}
}
