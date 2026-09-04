class Solution {
    static void reverse(int[] arr, int left, int right) {
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
    public void rotate(int[] nums, int k) {
        
        if(nums.length <= 1) return;
        k = k % nums.length;
        reverse(nums , nums.length - k , nums.length -1);
        reverse(nums , 0 ,( nums.length - k) -1 );
        
        reverse(nums , 0 , nums.length-1);
    }
}