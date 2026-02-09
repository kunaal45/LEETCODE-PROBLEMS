class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String[] arr =new String[str.length];
        int i=str.length-1;
         for(String st : str)
         {
            arr[i]=st;
            i--;
         }   
         return String.join(" ",arr);
    }
}