/*
 * @author: Nishi Agrawal
 */

/*
 * Link - https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions
 * Memory Usage: 38.9 MB, less than 53.22% of Java online submissions 
 * 
 * Q- Given a 0-indexed integer array nums, return true if it can be made 
 * strictly increasing after removing exactly one element, or false 
 * otherwise. If the array is already strictly increasing, return true. 
 * The array nums is strictly increasing if nums[i - 1] < nums[i]
 *  for each index (1 <= i < nums.length).
 */
public class IncreasingArray {
	
    public static boolean canBeIncreasing(int[] nums) {
        int noOfTimes = 0;
        int i = 0, j = 1;
        
        while(j< nums.length && i < j && noOfTimes < 2){
            if(nums[i] < nums[j]){
                i++;
                j++;
            }
            else{
                noOfTimes++;
                if(i == 0 || j == nums.length-1){
                    i++;
                    j++;
                }
                
                else{
                    if(nums[i-1] < nums[j]){
                        i++;
                        j++;
                    }
                    else if(nums[i] < nums[j+1]){
                        i+=2;
                        j+=2;
                    }
                    else return false;               
                }
                
            }
        }
        
        return noOfTimes> 1?  false: true;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,10,5,7};
		canBeIncreasing(nums);

	}

}
