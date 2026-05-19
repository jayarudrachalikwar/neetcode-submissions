class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int sum=0;
        while(left<right){
            sum=nums[left]+nums[right];
            if(sum>target){
                right--;
            }
            else{
                left++;
            }
            if(sum==target){
                break;
            }
        }
        return new int[]{left,right+1};
    }
}
