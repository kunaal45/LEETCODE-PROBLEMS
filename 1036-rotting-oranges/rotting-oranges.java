class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)
        {
            return 0;
        }

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int row = 0;row < grid.length;row++)
        {
            for(int col = 0;col < grid[0].length;col++)
            {
                if(grid[row][col]==2)
                {
                    q.add(new int[]{row,col});
                }
                if(grid[row][col]==1)
                {
                    fresh++;
                }
            }
        }

        if(fresh==0)
        {
            return 0;
        }

        int minutespassed=-1;
        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty())
        {
            int curlevel=q.size();
            minutespassed++;
            for(int i = 0;i < curlevel;i++)
            {
                int[] pos = q.remove();
                int row = pos[0];
                int col = pos[1];

                for(int[] direction : directions)
                {
                    int nrow = row + direction[0];
                    int ncol = col + direction[1];

                    if(nrow < 0 || ncol < 0 || nrow >= grid.length || ncol >= grid[0].length || 
                    grid[nrow][ncol]!=1 )
                    {
                        continue;
                    }
                    fresh--;
                    grid[nrow][ncol]=2;
                    q.add(new int[]{nrow,ncol});
                }  
            }
        }
        if(fresh==0)
        {
            return minutespassed;
        }
        else
        {
            return -1;
        }
    }
}