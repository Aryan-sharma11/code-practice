class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap();
        for(int i=0;i<nums1.length;i++)
        {
            if(h1.containsKey(nums1[i]))
                h1.put(nums1[i],h1.get(nums1[i])+1);
            else
                  h1.put(nums1[i],1);
        }
       Stack<Integer> st=new Stack();
        for(int i=0;i<nums2.length;i++)
        {  if(h1.containsKey(nums2[i]))
            {
                if(h1.get(nums2[i])>0)
                   {
                    st.push(nums2[i]);
                    h1.put(nums2[i],h1.get(nums2[i])-1);
                   }
            
            }       
        }
        int arr [] =new int [st.size()];
        int i=0;
        while(!st.isEmpty())
        {
            arr[i++]=st.pop();
        }
        return arr;
}
}
