class Solution {
    public int findLUSlength(String a, String b) {
        int c = a.length();
        int d = b.length();
        if(a.equals(b))
        {
            return -1;
        }
        else
        {
            if(c>d)
            {
                return c;
            }
            else
            {
                return d;
            }
            
        }
    }
}