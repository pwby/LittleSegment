 

//丑数
//其因数为【2 3 5】中的数
//1 是 丑数
 public boolean isUgly(int num) {
        if(num<=0){
            return false;
        }
        boolean flag=true;
        
        while(flag){
            if(num%2==0){
                num /= 2;
            }else if(num%3==0){
                num /= 3;
            }else if(num%5==0){
                num /= 5;
            }else if(num==1){
                break;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
        
    }