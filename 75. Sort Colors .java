class Solution {

    public void sortColors(int[] nums) {
    
        int start=0 , end=nums.length-1;
         int curr=0;
        
        while( curr<=end){
                             
                          
            if( nums[curr]== 0){   
                int temp= nums[start];
                nums[start]= nums[curr];
                nums[curr]= temp;   /// we just the swap the value of 0 and 2  
                start++;             /// and leave 1 as it is   move 0 to the left and move 2 to right      
                curr++;               // using two pointers 
            }else if( nums[curr]==2){
                 int temp= nums[end];
                nums[end]= nums[curr];
                nums[curr]=temp;
                end--;
            } else
                curr++;
            
            
        }
      
        
    }
}
