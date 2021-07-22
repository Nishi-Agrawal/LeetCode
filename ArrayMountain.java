/*
* @author: Nishi Agrawal
*/

/*
* Leetcode link - https://leetcode.com/problems/valid-mountain-array/
*
* Q - Given an array of integers arr, return true if and only if it is a valid mountain array.
*/

public class ArrayMountain {
	
	public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int previous = arr[0];
        int i = 1;
        boolean check = false;
        while(previous < arr[i]){
            if(i+1 > arr.length-1){
                return false;
            }
            check = true;
            previous = arr[i];
            i++;
        }
        boolean flag = false;
        while(previous > arr[i]){
        	flag = true;
            if((i+1) <= (arr.length-1) ){
                previous = arr[i];
                i++;
                if(previous <= arr[i]) {
                	return false;
                }
            }
            else break;
            
        }
        
        return (check == true && flag == true)? true : false;
    }

	public static void main(String[] args) {
		int [] arr = {0,3,2,1};
		System.out.println(validMountainArray(arr));

	}

}
