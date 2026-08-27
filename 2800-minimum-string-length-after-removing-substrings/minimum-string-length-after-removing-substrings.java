class Solution {
    public int minLength(String s) {
    
    String a ="AB",b = "CD";
    Stack<Character> st = new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        StringBuilder sc = new StringBuilder();
        if(st.size()==0)
        {
            st.push(s.charAt(i));
        }
        else
        {
            sc.append(st.peek());
            sc.append(s.charAt(i));
            if(sc.toString().equals(a) || sc.toString().equals(b))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }   
    }
    return st.size();   
    }
}