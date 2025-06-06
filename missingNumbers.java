class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0,check=0;
        for(int i=1;i<=nums.length;i++){
            sum+=i;
            check+=nums[i-1];
        }
        return sum-check;
    }
}
