class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result= new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            int sum=0,n=0;
            for(char ch:words[i].toCharArray())
            {
                 n = ch -'a';
                sum+=weights[n];
            }
            sum=sum%26;
            int v = 26-sum;
            char c = (char)('a'+v-1);
            result.append(c);
        }
        return result.toString();
    }
    
}