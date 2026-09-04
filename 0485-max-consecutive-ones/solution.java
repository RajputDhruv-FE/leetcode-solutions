class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int prevCount = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]== 0){
                if(prevCount < count){
                     prevCount = count;
                } 
                count = 0;
            }
            else{
                count++;
            }
        }
        return prevCount > count ? prevCount : count;
    }
}