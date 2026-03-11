class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sc = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            int len = sc.length();

            if(len > 0 && sc.charAt(len-1)==ch)
            {
                sc.deleteCharAt(len-1);
            }
            else
            {
                sc.append(ch);
            }
        }
        return sc.toString();
    }
}