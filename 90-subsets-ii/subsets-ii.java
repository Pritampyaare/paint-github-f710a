class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> group, int idx){
        ans.add(new ArrayList<>(group));
        for(int i=idx; i<nums.length; i++){
            if(i>idx && nums[i] == nums[i-1]) continue;
            group.add(nums[i]);
            helper(nums, ans, group, i+1);
            group.remove(group.size()-1);
        }
    }
}