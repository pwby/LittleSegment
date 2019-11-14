   
    public String toHex(int num) {
        if(num==0)return "0";
        String[] arr = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        String s = "";
        for(int i = 1;i <=8;i++){
            s = arr[(num&15)] + s;
            num>>>=4;
            if(num==0)break;
        }
        return s;
    }