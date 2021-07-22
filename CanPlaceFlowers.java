/*
 * @author: Nishi Agrawal
 */

/*
 * Link - https://leetcode.com/problems/can-place-flowers/submissions/
 * 
 * Runtime: 1 ms, faster than 89.32% of Java online submissions
 * Memory Usage: 40.4 MB, less than 76.15% of Java online submissions 
 * 
 * Q- You have a long flowerbed in which some of the plots are planted,
 *  and some are not. However, flowers cannot be planted in adjacent plots.
 *  Given an integer array flowerbed containing 0's and 1's, where 
 *  0 means empty and 1 means not empty, and an integer n, return if n 
 *  new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 */

public class CanPlaceFlowers {
	
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if((n == 1 && flowerbed[0] == 0) || (n == 0 && (flowerbed[0] == 1 || flowerbed[0] == 0))){
                return true;
            }
            
            return false;
        }
        for(int i=0; i< flowerbed.length; i++){
            if(i == 0 && flowerbed.length > 1){
                if(flowerbed[i+1] == 0 && flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
            else if(i == flowerbed.length -1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0){  
                    flowerbed[i] = 1;
                    n--;
                }
            }
            else{
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        
        return n <= 0? true : false;
    }

	public static void main(String[] args) {
		int [] flowerbed = {1,0,0,0,1};
		canPlaceFlowers(flowerbed, 1);

	}

}
