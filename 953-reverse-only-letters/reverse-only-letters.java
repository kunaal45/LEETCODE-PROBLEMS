class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r)
        {
            if(!Character.isLetter(ch[l]))
            {
                l++;
            }
            else if(!Character.isLetter(ch[r]))
            {
                r--;
            }
            else
            {
                char temp = ch[r];
                ch[r] = ch[l];
                ch[l] = temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}