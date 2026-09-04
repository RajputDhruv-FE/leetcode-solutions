import java.util.HashMap;
class Solution {
    public int missingNumber(int[] nums) {
        
HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , num);
        }

        int key=-1;
        for(int i = 0 ; i<=nums.length  ; i++){
            if(!map.containsKey(i)){
                key = i;
            }
        }
        return key;
    }
}