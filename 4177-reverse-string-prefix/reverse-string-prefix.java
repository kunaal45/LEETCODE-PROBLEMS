class Solution {
    public String reversePrefix(String s, int k) {
        String str = s.substring(0,k);
        String str1 = s.substring(k);
        str= new StringBuilder(str).reverse().toString();
        return str+str1;
    }
}