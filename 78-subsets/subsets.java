class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++)
        {
            int s = lst.size();
            for(int j=0;j<s;j++)
            {
                List<Integer> lst2 = new ArrayList<>(lst.get(j));
                lst2.add(nums[i]);
                lst.add(lst2);
            }
        }
        return lst;
    }
}