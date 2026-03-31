class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
        int reqd = target - nums[i];
        if(map.containsKey(reqd)) {
            return new int[]{map.get(reqd),i};
        }
        map.put(nums[i],i);
        
    }
    return new int[]{-1,-1};
    }
}
