class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ex = -1;
        int cnt = 0;
        int size = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        Map<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<size;i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],i));
        }
        int[] rs = new int[size];
        for(int i=0;i<size;i++) {
            rs[i] = hm.get(nums[i]);
        }
        return rs;
    }
}
