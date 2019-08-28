class Solution {
    public static void main(String[] args) {
        int[] array=new int[]{5,5,20,5,5,10,5,10,5,20};
        System.out.println(lemonadeChange(array));
    }
    public static boolean lemonadeChange(int[] bills) {
        if(bills[0]==10 || bills[0]==20){
            return false;
        }
        int count5=0;
        int count10=0;
        for(int i=0;i<bills.length;i++){
            int rs=bills[i]/5;
            if(rs==1){
                count5++;
            }else if(rs==2){
                count10++;
                count5--;
            }else if(rs==4){

                count10--;
                count5--;
            }
        }
        if(count5>=0 && count10>=0){
            return true;
        }
        return false;


    }
}