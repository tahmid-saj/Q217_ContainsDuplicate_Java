class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;

        Arrays.sort(nums);
        int currNum = nums[0], currCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != currNum) {
                currNum = nums[i];
                currCount = 0;
            }
            currCount++;
            if (currCount >= 2) return true;
        }

        return false;
    }
}
