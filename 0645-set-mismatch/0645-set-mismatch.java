class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 0) {
                arr[1]=i;
            }
            if (count > 1) {
                arr[0]=i;
            }
        }  
        return arr;
    }
}