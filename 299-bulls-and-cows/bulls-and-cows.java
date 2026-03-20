class Solution {
    public String getHint(String secret, String guess) {
        int c1 = 0,c2 = 0;
        int[] arr = new int[10];
        for(int i=0;i<secret.length();i++)
        {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s==g)
            {
                c1++;
            }
            else
            {
                if(arr[s - '0']<0)
                {
                    c2++;
                }

                if(arr[g - '0']>0)
                {
                    c2++;
                }

                arr[s - '0']++;
                arr[g - '0']--;
            }
        }
        return c1 + "A" + c2 + "B";
    }
}