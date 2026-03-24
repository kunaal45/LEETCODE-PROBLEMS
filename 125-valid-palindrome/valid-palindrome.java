class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sc = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                char lower = Character.toLowerCase(ch);
                sc.append(lower);
            }
        }
       String original = sc.toString();
       String reversed = sc.reverse().toString();

       return original.equals(reversed);
    }
}