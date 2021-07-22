/*
 * @author: Nishi Agrawal
 */

/*
 * Link - https://leetcode.com/problems/count-primes/
 * 
 * Q - Count the number of prime numbers less than a non-negative number, n.
 * 
 * There are two solution for this problem. Please uncomment to run the 
 * second solution. One solution uses Sieve of Eratosthenes in order to find
 * the prime numbers. It maintains count while updating the sieve array. 
 */

public class CountPrimes {
	
   /* public boolean prime(int n){
    	if(n == 2) {
    		return true;
    	}
    	
        if(n < 2 || n % 2 == 0 || n % 3 == 0){
            return false;
        }
        
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int countPrimes(int n) {
        int count = 0;
        int number = n;
                
        for(int i = n; i >= 2; i--){
                if(prime(i)){
                    count++;
            }
            
        }
        return count;
    }*/
    
    public int countPrimes(int n) {
    	int count = 0;
    	boolean[] sieve = new boolean[n];
    	
    	for(int i = 2; i<n; i++) {
    		if(sieve[i] == false) {
    			count++;
    		}
    		for(int j = 2; i*j<n; j++) {
    			sieve[i*j] =true;
    		}
    	}
    	
    	return count;
    }
       

	public static void main(String[] args) {
		CountPrimes cp = new CountPrimes();
		System.out.println(cp.countPrimes(5000000));

	}

}
