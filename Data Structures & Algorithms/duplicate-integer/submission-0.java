class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int n=nums.length;
        return n==set.size()?false:true;
    }
}