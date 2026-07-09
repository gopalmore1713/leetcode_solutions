class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int value = nums.length + 1;
        int narr[] = new int[value];
        for(int i =0 ; i<nums.length; i++){
            narr[2] = 0;
           for(int j =i+1; j<nums.length; j++){
            narr[2] = nums[i] + nums[j];
            if(narr[2] == target){
                arr[0] = i;
                arr[1] = j;
                return arr;
            }
           
           }

        }
       return arr;
    }
}