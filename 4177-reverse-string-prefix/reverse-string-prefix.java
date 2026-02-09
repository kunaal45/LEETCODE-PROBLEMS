class Solution {
    public String reversePrefix(String s, int k) {
        String str="";
        String str1="";
        for(int i=0;i<s.length();i++)
        {
            if(i==k)
            {
                str1=s.substring(k);
                break;
            }
            str+=s.charAt(i);
        }
        str= new StringBuilder(str).reverse().toString();
        return str+str1;
    }
}