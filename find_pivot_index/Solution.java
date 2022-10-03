class Solution {
    
  public int pivotIndex(int[] nums) {
        // init
        int startIndex = 0;
        int endIndex = nums.length - 1;
        
        int leftSum = 0;
        int rightSum = 0;

        // for each element
        for(int pivotIndex = 0; pivotIndex < nums.length; pivotIndex++) {
            
            // calculate sum of elements left and right to current element
            while(startIndex < endIndex) {
                if(startIndex < pivotIndex) {
                    leftSum += nums[startIndex++];    
                } 
                  
                if(endIndex > pivotIndex) {
                    rightSum += nums[endIndex--];
                }
            }

            // if sum is equal, return the current element index
            if(leftSum == rightSum) {
                return pivotIndex;
            }
            
            // reset
            startIndex = 0;
            endIndex = nums.length - 1;
            
            leftSum = 0;
            rightSum = 0;
        }
        
        // return -1 if no pivot index found
        return -1;
    }
}
