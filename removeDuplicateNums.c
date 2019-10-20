//C语言
int removeDuplicates(int* nums, int numsSize){
if(numsSize<1){
    return 0;
}
int i=0,j=1;
    while(j<numsSize){
        if(nums[i]==nums[j]){
            j++;
        }else{
            i++;
            nums[i]=nums[j];
            j++;
        }
    }
    return i+1;
}
//python
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)<1:
            return 0
        pre,cur=0,1
        while cur<len(nums):
            if nums[pre]==nums[cur]:
                nums.pop(cur)
            else:
                pre,cur=pre+1,cur+1
        return len(nums)    
        
//java
class Solution {
      public int removeDuplicates(int[] nums) {
        if(nums==null){
            return 0;
        }
      int i=0;
      int j=1;
      while(j<nums.length){
          if(nums[i]==nums[j]){
              j++;
          }else{
              i++;
              nums[i]=nums[j];
              j++;
          }
      }          
       
        return i+1;
    }
}