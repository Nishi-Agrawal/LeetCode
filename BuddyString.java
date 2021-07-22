import java.util.HashMap;

/*
 * @author: Nishi Agrawal
 */

/*
 * Link - https://leetcode.com/problems/buddy-strings/
 * 
 * Q - Given two strings s and goal, return true if you can swap two letters 
 * in s so the result is equal to goal, otherwise, return false.
 * Swapping letters is defined as taking two indices i and j (0-indexed)
 * such that i != j and swapping the characters at s[i] and s[j]
 * 
 * Runtime: 2 ms, faster than 73.72% of Java online submissions
 * Memory Usage: 39.3 MB, less than 27.65% of Java online submissions 
 * 
 */


public class BuddyString {
	
    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        boolean flag1 = false;
        HashMap<Character, Integer> hp = new HashMap<>();
        int counter = 0;
        int position1 = 0;
        int position2 = 0;
        boolean flag = false;
        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) != goal.charAt(i)){
                if(counter ==0){
                   counter++;
                    position1 = i; 
                }
                else if(counter == 1){
                    counter++;
                    position2 = i;
                }
                    else return flag;
                }
            else if (flag1 == false){
                
                int z = 1+hp.getOrDefault(s.charAt(i), 0);
                hp.put(s.charAt(i), z);
                if(z>=2){
                    flag1=true;
                }
            }
            
        }
        
        if((counter == 2 && s.charAt(position1) == goal.charAt(position2) && s.charAt(position2) == goal.charAt(position1) ) || (counter == 0 && flag1)){
        flag = true;}
        
        return flag;
    }

	public static void main(String[] args) {
		buddyStrings("ab", "ba");

	}

}
