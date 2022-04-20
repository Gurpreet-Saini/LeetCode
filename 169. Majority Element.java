SPACE O(1) TIME = n(log n)

class Solution {
    public int majorityElement(int[] nums) {
        
			Arrays.sort(nums);    //sorting the array
         return nums[nums.length/2]; // return the middle element 
    }
}

<----Second approch----->
  time= o(N) space O(1)
  class Solution {
    public int majorityElement(int[] num) {
        
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }
            else if(major==num[i]){
                count++;
            }
            else count--;
            
        }
        return major;
    }
}
