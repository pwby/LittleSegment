

 public boolean isPowerOfFour(int num) {
        if(num == 1) return true;
        while(num > 4 && num % 4 == 0) num /= 4;
        return num == 4;
    }


 public boolean isPowerOfFour(int num) {
        double check = Math.log(num) / Math.log(4);
        if(check == (int)check)
            return true;
        return false;
    }
	
	public boolean isPowerOfFour(int num) {
        if(num==0){
            return false;
        }
        double check=num;
        for(int i=0;i<32;i+=2){
            if(num==1<<i){
                return true;
        }
    }
        return false;
}