class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i];
            if(hpp.containsKey(remaining)){
                return new int[] {hpp.get(remaining),i};
            }
            hpp.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
