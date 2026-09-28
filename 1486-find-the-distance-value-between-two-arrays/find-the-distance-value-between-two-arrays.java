class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1 = arr1.length,n2 = arr2.length;
        int ans=0;
        for(int i=0;i<n1;i++)
        {
            int a=0;
            for(int j=0;j<n2;j++)
            {
                int sum = Math.abs(arr1[i]-arr2[j]);
                if(sum>d)
                {
                    continue;
                }
                else
                {
                    a=1;
                    break;
                }
            }
            if(a==0)
            {
                ans++;
            }
        }
        return ans;
    }
}