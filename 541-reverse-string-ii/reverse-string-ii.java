class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            int st = i;
            int end = Math.min(i+k-1,s.length()-1);

            while(st<end)
            {
                char temp =ch[end];
                ch[end]=ch[st];
                ch[st] = temp;
                st++;
                end--;
            }

        }
        return new String(ch);
    }
}