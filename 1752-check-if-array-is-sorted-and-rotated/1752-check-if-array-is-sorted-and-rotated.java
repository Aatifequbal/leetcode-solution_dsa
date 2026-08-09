class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Adjacent elements check
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }

        // Last element ko first element se compare karo
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        // Maximum 1 break allowed
        return count <= 1;
    }
}