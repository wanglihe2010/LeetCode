class Problem80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=2) return nums.length;
        int removeIndex = -1;
        boolean isDuplicated = false;
        int num = nums[0];
        int newLen = nums.length;
        for(int i = 1; i < nums.length; i ++ ) {
            if(nums[i] == num) {
                if(isDuplicated) {
                    // remove
                    if(removeIndex <0) removeIndex = i;
                    newLen --;
                } else {
                    isDuplicated = true;
                    if(removeIndex>= 0) {
                        swipe(removeIndex,i,nums);
                        removeIndex++;
                    }
                }
            } else {
                num = nums[i];
                isDuplicated = false;
                if(removeIndex>= 0) {
                    swipe(removeIndex,i,nums);
                    removeIndex++;
                }
            }
        }
        return newLen;
    }

    private void swipe(int index1, int index2, int[] nums) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}