 
 
  public int climbStairs(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int way1=1,way2=2,way=0;
        for(int i=3;i<=n;i++){
            way=way1+way2;
            way1=way2;
            way2=way;
        }
        return way;
        
    }
 
 
 public int climbStairs(int n) {
     int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int res = 0;
        for(int i = 2;i<=n;i++){
            nums[i] = nums[i-1] + nums[i-2];
             res = nums[i];
        }
            return res;
    }
