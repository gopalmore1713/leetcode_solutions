class Solution {
    public int maxProduct(int[] nums) {
     int frist = 0;
     int last = 0;
     for(int i =0; i<nums.length; i++){
        if(nums[i]>last){
            frist = last;
            last = nums[i];
        }
        else if(nums[i]>frist){
            frist = nums[i];
        }
     }   
     int val = (frist - 1) * (last - 1);
     return val;
    }
}