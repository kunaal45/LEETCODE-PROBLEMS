class Solution {
    public boolean isValid(String word) {
        int conc=0,vowc=0,digits=0,c=0;
        int n = word.length();
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);

            if(ch>='A' && ch<='Z')
            {
                 ch=Character.toLowerCase(ch);
            }
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowc++;
            }
            else if(ch>='a' && ch<='z')
            {
                conc++;
            }
            else if(ch>='0' && ch<='9')
            {
                digits++;
            }
            else
            {
                c++;
            }
        }
        if(vowc>=1 && n>=3 && conc>=1 &&  c==0)
        {
            return true;
        }
        return false;
    }
}