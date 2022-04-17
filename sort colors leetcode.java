class Solution {
    public void swap(int a , int b ,int[] nums)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1; //element left to low will be 0s elements right to high will be 2s and elements between low and mid will be all 1s
      //dutch national flag algo
        
        while(mid<=high)
        {
            if(nums[mid]==0 )
            {
                swap(low,mid,nums);
                low++;
                mid++;
            }
           else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(mid,high,nums);
                high--;
            }
        }
        
    }
}
