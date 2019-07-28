package day39;

import java.util.Scanner;

/**
 * 两种判定方法：中间加入字符，如果该字符串本身就是回文，其为偶数时，则只需要往中间见一个字符，即可成为回文
 *                                       其为奇数时，只需要与中间对称位置处加入字符即可
 *               两端加入字符，如果该字符串不是回文，则如若其0-length-2是回文，则在首端加入与末端相对应的字符即可变为回文
 *                                                 则如若其1-length-1是回文，则在末端加入与首端相对应的字符即可变为回文
 * */

public class MakeRerverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            if(isRerverse(s) || isRerverse(s.substring(0,s.length()-1)) || isRerverse(s.substring(1,s.length()))){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static boolean isRerverse(String s){
        if(new StringBuffer(s).reverse().toString().equals(s)){
            return true;
        }
        return false;
    }
}
