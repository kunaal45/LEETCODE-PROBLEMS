class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst = new ArrayList<>();
        int i=0;
        for(String str: words)
        {
            if(str.contains(String.valueOf(x)))
            {
                lst.add(i);
            }
            i++;
        }
        return lst;
        
    }
}