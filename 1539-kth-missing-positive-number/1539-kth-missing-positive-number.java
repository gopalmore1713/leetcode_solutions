class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        //Approach: Linear SEARCH
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + k; 

        /*   int current = 1;
        int index = 0;
        // Approach: BINEARY SEARCH
        while (k > 0) {
            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                k--;
                if (k == 0) {
                    return current;
                }
            }
            current++;
        }

        return current; */
    }
}