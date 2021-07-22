/*
 * @ author: Nishi Agrawal
 */

/*
 * Link - https://leetcode.com/problems/reverse-integer/
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 36.2 MB, less than 56.96% of Java online submissions 
 * 
 * Q- Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit 
 * integer range [-231, 231 - 1], then return 0.
 */

public class Rev {
	
    public static int reverse(int x) {
        if(x== Integer.MIN_VALUE){
             return 0;
         }
         boolean flag = x < 0? true: false; 
         if(flag == true){
             x = -x;
         }
         int y = 0;
         while(x > 0){
         	if(y > Integer.MAX_VALUE/10) {
         		return 0;
         	}
             y = y*10;
  
             y = y + x%10;
             
             x = x/10;
                     
         }
         
         if (flag == true){
             return -(int)y;
         }
         return (int)y;
     }

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));

	}

}
