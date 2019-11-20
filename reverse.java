
//数字的翻转采用对10求模,再用除以10后的数字作为下次关于10求模的数字
//直接计算转换后的结果,然后与整数的范围比较
//不过最后的结果无法预期,所以需要用长整形存储
    public int reverse(int x) {
        long temp = 0;
       
        while(x != 0){
            int pop = x % 10;
            temp = temp * 10 + pop;
            
            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)temp;
    }

	
	//与上面的做法一样
	//一共有十位数 最大数为2147483647   最小数为-2147483648
	//开头的数 不是 1 就是 2   ,1 2 0 对于翻转后的数字没影响
	//对于正数而言,最后一位数字是 7  对于负数而言,最后一位数是8
    //所以在第九位数就做了判断,故其可以用int类型存储
 public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10) return 0;
            if (rev < Integer.MIN_VALUE/10) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }