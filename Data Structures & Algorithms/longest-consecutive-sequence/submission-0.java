class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int max=1;
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i:st){
            if(!st.contains(i-1)){
                int cnt=1;
                int x=i;
                while(st.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}
