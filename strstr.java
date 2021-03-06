/*
 * @author: Nishi Agrawal
 */

/*
 * Link - https://leetcode.com/problems/implement-strstr/
 * 
 * Q - Implement strStr().
 * Return the index of the first occurrence of needle in 
 * haystack, or -1 if needle is not part of haystack.
 * 
 */

public class strstr {

	public static int strStr(String haystack, String needle) {
		if(needle.length() == 0 || haystack.equals(needle)) {
			return 0;
		}
		if(haystack.length() < needle.length()) {
			return -1;
		}
		
		char start = needle.charAt(0);
		for(int i = 0; i< haystack.length(); i++) {
			if(haystack.charAt(i) == start) {
				for(int j = 0; j < needle.length(); j++) {
					if(i+j > haystack.length()-1) {
						break;
					}
					if(haystack.charAt(i+j) != needle.charAt(j)) {
						break;
					}
					if(j == needle.length()-1) {
						return i;
					}
				}
				
				
			}
		}
		return -1;
		

	}

	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issipi"));

	}

}
