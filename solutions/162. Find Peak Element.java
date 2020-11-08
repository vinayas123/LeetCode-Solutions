class Solution {
    public int findPeakElement(int[] nums) {
        //binary search
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left < right){
           mid =  left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else {
                right = mid; 
            }
            
        }
        return left;
    }
}
