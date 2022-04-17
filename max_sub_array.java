class Solution {
    public int maxSubArray(int[] nums) {
    int max=0, k=0;
    k=nums[0];
        for(int i=0; i<nums.length;i++)
        {
            max=max+nums[i];
            if(max>k)
            {
                k=max;
            }
             if(max<0)
        {
            max=0;
        }
        }
       
    return k;
        
    }
}
