class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int start=nums.length,end=0;
        for(int i=0;i<nums.length;i++)
        {
            while(!st.isEmpty() && nums[i]< nums[st.peek()])
            {
                start = Math.min(start,st.pop());
            }
            st.push(i);
        }
        st.clear();

        for(int i=nums.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums[i]> nums[st.peek()])
            {
                end = Math.max(end,st.pop());
            }
            st.push(i);
        }
        if(end<=start)
        {
            return 0;
        }
        return end-start+1;
    }
}