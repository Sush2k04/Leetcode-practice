class Solution {
    public int pivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int l=0,r=0;
        for(int i=0;i<nums.length;i++){
            l+=nums[i];
            left[i]+=l;
            r+=nums[nums.length-i-1];
            right[nums.length-i-1]+=r;
        }
        for(int i=0;i<nums.length;i++){
            if((left[i] - right[i]) == 0 ) return i;
        }
        return -1;
    }
}
