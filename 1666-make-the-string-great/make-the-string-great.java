class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            int len = str.length();
            if(len>0 &&  Math.abs(str.charAt(len-1)-ch)==32)
            {
                str.deleteCharAt(len-1);
            }
            else
            {
                str.append(ch);
            }
        }
        return str.toString();
    }
}