 
 //这种方法很好
 //在最开始淘汰掉最熟悉的一些数字
 //然后利用求模 和 整除 这种方法只需要计算一半数字
 //当数字个数为偶数时,求一半后的数字
 //当数字个数为奇数时,一半后的数字会多一个,不过中间这个数不影响大体
 //比如:12321  x=12 middle= 123 所以需要给midlle除以10
 //比如:123321 x=123  middle=123  不需要除以10
 public boolean isPalindrome(int x) {
      if(x<0 ||x % 10 ==0 && x!=0){
          return false;
      }
      int middle=0;
      while(x>middle){
          middle=middle * 10 + x % 10;
          x /= 10;
      }
      return x==middle || middle / 10 == x;
    }
	
	
//利用字符串的特性,从前往后与从后往前对比