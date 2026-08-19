class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int maxValue = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum > maxValue){
                maxValue = sum;
            }
            if(sum < 0 ){
                sum = 0;
            }
        }
        return maxValue;
        
    }
}