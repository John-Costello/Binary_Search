class Solution
{
    public int search(int[] nums, int target)
    {
        int resultIndex;
        if(nums.length<=0 || nums==null)
        {
            resultIndex=-1;
        }
        else
        {
           int lowerSearchIndex=0;
           int upperSearchIndex=nums.length-1;
           int inbetweenSearchIndex=(upperSearchIndex+lowerSearchIndex)/2;        
           while(nums[inbetweenSearchIndex]!=target && upperSearchIndex-lowerSearchIndex>1)
           {                
              if(target>nums[inbetweenSearchIndex])
              {
                  lowerSearchIndex=inbetweenSearchIndex;
              }
              else // if(target<=nums[inbetweenSearchIndex])
              {
                  upperSearchIndex=inbetweenSearchIndex;
              }
              inbetweenSearchIndex=(upperSearchIndex+lowerSearchIndex)/2;
           }
           if(nums[inbetweenSearchIndex]==target){resultIndex=inbetweenSearchIndex;}
           else if(nums[upperSearchIndex]==target){resultIndex=upperSearchIndex;}
           else if(nums[lowerSearchIndex]==target){resultIndex=lowerSearchIndex;}
           else resultIndex=-1;
        }
        return resultIndex;
    }
}
