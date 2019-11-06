
//字符串的最大公因子
//4+6=6+4

//最大公约数
    public String gcdOfStrings(String str1, String str2) {
        
     if((str1+str2).equals(str2+str1)){
          int len=gcd(str1.length(),str2.length());
         return str1.substring(0,len);
     }
        return "";
    }
    public int gcd(int x,int y){
        int min=Math.min(x,y);
        int rest=1;
        for (int i=2;i<=min;i++){
            if(x%i==0 && y%i==0){
                rest=i;
            }
        }
        return rest;
    }
	
	
//辗转相除法
if str1+str2 != str2+str1:
            return ''    
        difference = len(str1)-len(str2)
        if difference==0:
            return str1
        elif difference > 0:
            str1 = str1[len(str2): len(str1)]
        else:
            str2 = str2[len(str1): len(str2)]
        
        return self.gcdOfStrings(str1,str2)