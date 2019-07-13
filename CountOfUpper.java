package day36;

import java.util.Scanner;
/**
 * 打印出一行字符串中各个大写字母的个数
 * 2234)_+AAABB44BB
 * 比如：A:3
 *      B:4
 *      C:0
 *
 * */
public class CountOfUpper{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch=sc.nextLine().toCharArray();
            int[] rs=new int[26];
            for(int i=0;i<ch.length;i++){
                if(ch[i] >= 'A' && ch[i] <= 'Z'){
                    rs[ ch[i] - '0'-17]++;
                }
            }
            for(int i=0;i<26;i++){
                char c=(char)(i+17+'0');
                System.out.println(c+":"+rs[i]);

            }

        }
    }
}
