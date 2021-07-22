/*
 * @author: Nishi Agrawal
 */

/*
 * Link - https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * 
 * Runtime: 1 ms, faster than 57.83% of Java online submissions
 * Memory Usage: 40.4 MB, less than 81.23% of Java online submissions 
 * 
 * Q - Given an integer array nums sorted in non-decreasing order, 
 * remove the duplicates in-place such that each unique element appears
 *  only once. The relative order of the elements should be kept the same.
 * 
 */

public class RemoveDuplicates {
	
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;
   int i = 0;
   for (int j = 1; j < nums.length; j++) {
       if (nums[j] != nums[i]) {
           i++;
           nums[i] = nums[j];
       }
   }
   return i + 1;
       
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
