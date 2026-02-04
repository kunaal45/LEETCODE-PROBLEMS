class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] s = new String[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> score[b] - score[a]);

        for(int i=0;i<n;i++)
        {
            pq.offer(i);
        }
        
        int rank = 1;
        while(!pq.isEmpty())
        {
            int ind = pq.poll();
            if(rank==1)
            {
                s[ind] = "Gold Medal";
            }
            else if(rank==2)
            {
                s[ind] = "Silver Medal";
            }
            else if(rank==3)
            {
                s[ind] = "Bronze Medal";
            }
            else
            {
                s[ind] = String.valueOf(rank);
            }

            rank++;
        } 
        return s;
    }
}