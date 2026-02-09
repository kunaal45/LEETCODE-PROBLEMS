class Solution {
    public String reversePrefix(String s, int k) {
        if(k>s.length())
        {
            k=s.length();
        }
        char[] ch = s.toCharArray();
        int l=0,r=k-1;
        while(l<r)
        {
            char temp =ch[r];
            ch[r]=ch[l];
            ch[l]=temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}