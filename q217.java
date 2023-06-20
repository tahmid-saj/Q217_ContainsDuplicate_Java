class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            return false;
        }

        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (nums[i] == nums[j]) {
                return true;
            }
        }

        return false;
    }
}
