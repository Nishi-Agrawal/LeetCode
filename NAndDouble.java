import java.util.HashSet;
import java.util.Set;

/*
 * @author: Nishi Agrawal
 * 
 * Link- https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * 
 * Q - Given an array arr of integers, check if there exists two integers
 *  N and M such that N is the double of M ( i.e. N = 2 * M).
 * 
 */
public class NAndDouble {

	public static boolean checkIfExist(int[] arr) {
		Set<Integer> s = new HashSet<>();
		int noOfZero = 0;
		for(int i: arr) {
			if(i == 0) {
				noOfZero++;
				if(noOfZero > 1) {
					return true;
				}
			}
			s.add(i);
		}
		for(int i: arr) {
			if(s.contains(2*i) && i != 0 ) {
				return true;
			}
		}
		
		return false;

	}

	public static void main(String[] args) {
		int[] arr = {-2,0,10,-19,4,6,-8};
		System.out.println(checkIfExist(arr));

	}

}
