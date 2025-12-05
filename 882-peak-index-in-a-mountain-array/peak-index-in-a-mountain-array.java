class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is to the right
                low = mid + 1;
            } else {
                // Peak is at mid or to the left
                high = mid;
            }
        }

        return low; // or high, since low == high
    }
}
