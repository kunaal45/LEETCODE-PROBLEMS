class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int i=0,j=students.length-1;
        while(i<students.length && j>=0)
        {
            queue.offer(students[i]);
            st.push(sandwiches[j]);
            i++;
            j--;
        }
        int c = 0;
        while(true)
        {
            if(queue.peek()==st.peek())
            {
                queue.poll();
                st.pop();
                c=0;
            }
            else
            {
                Integer n = queue.poll();
                queue.offer(n);
                c++;
            }

            if(c==st.size() || st.isEmpty() || queue.isEmpty())
            {
                break;
            }
        }
        return c;
        
    }
}