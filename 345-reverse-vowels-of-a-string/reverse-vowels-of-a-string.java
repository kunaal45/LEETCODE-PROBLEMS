class Solution {
    public String reverseVowels(String s) {
        StringBuilder sc = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1)
            {
                sc.append(s.charAt(i));
            }
        }
        sc.reverse();
        int j=0;
        for(int i=0;i<ch.length;i++)
        {
            if("aeiouAEIOU".indexOf(ch[i])!=-1)
            {
                ch[i]=sc.charAt(j);
                j++;
            }
        }
        return new String(ch);
    }
}