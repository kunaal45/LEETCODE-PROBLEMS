class Solution {
    public String reversePrefix(String s, int k) {
        if(k>s.length())
        {
            k=s.length();
        }
        StringBuilder str = new StringBuilder();
        str.append(s,0,k);
        str.reverse();
        str.append(s,k,s.length());
        return str.toString();
    }
}