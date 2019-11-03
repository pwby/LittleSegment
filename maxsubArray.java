 
 //max记录最大值
 //imax记录当前连续值
 //当前连续值与当前值相加后的结果若不能超过最大值，则最大值还是为max，否则会覆盖掉最大值
 public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int max=nums[0],imax=nums[0];
        for (int i=1;i<nums.length;i++){
            imax=Math.max(imax+nums[i],nums[i]);
            max=Math.max(imax,max);
        }
        return max;
    }