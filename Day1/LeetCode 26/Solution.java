class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 1; // Start from the second position
        for (int i = 1; i < nums.length; i++) {
            // Only copy if the current number is different from the last unique one
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex; // uniqueIndex will be the count of unique elements
    }
}
