class Solution {
    public int subarraySum(int[] nums, int k) {
        int ts=0;
		for(int i=0;i<nums.length;i++){
			int curr=0;
			for(int j=i;j<nums.length;j++) {
				curr=curr+nums[j];
				if(curr == k) {
					ts++;
				}
			}
			
		}
		return ts;
    }
}