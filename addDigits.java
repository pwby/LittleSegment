 
  
/* 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
输入: 38
输出: 2 
解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。 */
    public int addDigits(int num) {
        //借一个人在还回来
         return (num - 1) % 9 + 1;
    }
 
 //规律
 public int addDigits(int num) {
        if(num%9==0){
			return 9;
    }else{
		return num%9;
	}
 }
 
  
 public int addDigits(int num) {
        
        while(true){
            int decade=num%10;
            int unit=num/10;
            int add=decade + unit;
            if(add<10){
                return add;
            }
            num=add;
        }
    }