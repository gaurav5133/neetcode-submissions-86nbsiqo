class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int i=0; i<=n; i++) {
            bucket[i] = new ArrayList<>();
        }

        for(int key : map.keySet()) {
            int freq = map.get(key);
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int idx = 0;
        for(int i= bucket.length-1; i>=0 && idx < k; i--) {
            for(int num : bucket[i]) {
                result[idx++] = num;
                if(idx == k) break;
            }
        }

        return result;

    }
}