class Solution {
    public void swap( int a, int b, int [] nums) // swapping the two elements
    {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    void reverse(int start ,int end , int [] nums) //to reverse the array with given start and end index
    {
        while(start<end)
            
        {
            swap(start++ , end-- ,nums);
        }
    }
    public void nextPermutation(int[] nums) {
        
        int k ;
        
        // Finding the break point (two pointer are in ascending order)
        for(k = nums.length-2 ; k>=0 ; k--) 
        {
            if(nums[k]<nums[k+1])
                break;
        }
             
        if(k<0) // if the array is in descending order
            reverse(0,nums.length-1,nums);
        else
        {
            int i;
            for(i = nums.length-1 ; i>k ; i--) // Finding the next permutation element
            {
                if(nums[i]>nums[k])
                    break;
            }
            
            swap(i,k,nums);
            reverse(k+1,nums.length-1,nums); // reversing the array to get the final permutation
        }
        

        
    
       
        }
}
