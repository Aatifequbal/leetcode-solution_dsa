class Solution {
    public void moveZeroes(int[] nums) {
       int j=0;
       int n= nums.length;
       //TC o(n)
       //SC 0(1)

       for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        
    }
}