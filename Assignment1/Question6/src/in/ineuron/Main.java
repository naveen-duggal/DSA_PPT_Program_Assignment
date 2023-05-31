package in.ineuron;

import java.util.HashSet;

/*
 * 
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true

*
*/

public class Main {
	
	public boolean containsDuplicate(int[] nums) {
	       HashSet<Integer> set=new HashSet<>();
	       for(int num:nums) {
	    	   if(set.contains(num)) {
	    		   return true;
	    	   }
	    	   set.add(num);
	       }
	       return false;
	    }

	public static void main(String[] args) {
		 int[] nums = {1,6,8,4,3,6};
	        
		 Main containsDuplicate = new Main();
	        boolean result = containsDuplicate.containsDuplicate(nums);
	        
	        System.out.println("Result: " + result);      
	}
}
//This code is contributed by Naveen Duggal...