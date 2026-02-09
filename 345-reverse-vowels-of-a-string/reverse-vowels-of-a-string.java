class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l=0,r=ch.length-1;
        while(l<r)
        {
            while(l<r && "aeiouAEIOU".indexOf(ch[l])==-1)
            {
                l++;
            }
            while(l<r && "aeiouAEIOU".indexOf(ch[r])==-1)
            {
                r--;
            }
            char temp=ch[l];
            ch[l] =ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}