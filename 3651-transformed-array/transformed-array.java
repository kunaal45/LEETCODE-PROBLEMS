class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; 
        for(int i=0;i<n;i++)
        {
            int a =nums[i];
            int pos=(i+a) % n;
            if(pos<0)
            {
                pos+=n;
            }
            res[i]=nums[pos];
        }
        return res;
    }
}