 
 
 public static  String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        char sign =' ';
        if(num<0){
            sign='-';
            num *= -1;
        }
        StringBuilder sb=new StringBuilder();
        while(num !=0){
            int rest = num % 7;
            sb.append(rest);
            num /= 7;
        }
       return  sb.append(sign).reverse().toString().trim();

    }