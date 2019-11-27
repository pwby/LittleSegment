        //奇数
        //0 0 0    true
        //0 1 0    false  以010结尾的是false

        //1 0 0    true
        //1 1 0    true
   

        //偶数
        //0 0 0 0  true
        //0 0 1 0  false
        //0 1 0 0  true
        //0 1 1 0  true

        //1 0 0 0   true
        //1 0 1 0   false
        //1 1 0 0   true
        //1 1 1 0   false

        //0 0 0 0 0
        //0 0 0 1 0  false
        //0 0 1 0 0  
        //0 0 1 1 0  
        //0 1 0 0 0  
        //0 1 0 1 0  false
        //0 1 1 0 0  
        //0 1 1 1 0  false

        //1 0 0 0 0  
        //1 0 0 1 0  false
        //1 0 1 0 0  
        //1 0 1 1 0
        //1 1 0 0 0
        //1 1 0 1 0  false
        //1 1 1 0 0   
        //1 1 1 1 0 
//如果是1比特字符就加1,	相当于从下个字符开始算起
//如果是2比特字符就加2,相当于跳过一个字符,从头开始
//能够落到bits.length-1上的就是从0开始,满足一比特字符条件
//否则就会超过bits.length的长度,不满足以比特字符	
public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

		
		
//规律题
//凡是以010结尾的都不是一比特数,所以返回false
//凡是从倒数第二位开始,奇数个1的都不是一比特数,返回false,否则返回true
//11110,在循环内部无法判断1的位数,所以在循环外部加以判断
//太蠢了,010也是奇数个1,

 public boolean isOneBitCharacter(int[] bits) {
        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0) i--;
        return (bits.length - i) % 2 == 0;
    }


public boolean isOneBitCharacter(int[] bits) {
       if(bits.length==2){
          return bits[0]==1 ? false : true;
       }
       int count=0;
       for(int i=bits.length-2;i>=0;i--){
             if(bits[bits.length-2]==1 && bits[i]==1){
                 count++;
             }else{
                 if(count%2!=0){
                     return false;
                 }else{
                     return true;
                 }
             }
       }
       return count%2!=0 ? false :true;
    }