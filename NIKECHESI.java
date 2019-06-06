package day14;

/**
 * author:byw
 * 尼科彻斯定理
 * 第一种方法：可以使用递归
 * 第二种方法：把该问题转化为等差数列
 */
import java.util.Scanner;
import java.util.Scanner;
public class NIKECHESI{
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            int n=sc.nextInt();
//            System.out.println(test(n));
//        }
        anotherMethod();
    }
    public static String test(int n){
        if(n==1){
            return "1";
        }
        if(n==2){
            return "3+5";
        }
        if(n>2){
            //长见识了[]
            String[] str=test(n-1).split("[+]");
            int start=Integer.valueOf(str[n-1-1]);
            StringBuffer sb=new StringBuffer();
            int array[] =new int[n];
            for(int i=0;i<n-1;i++){
                array[i]=start+2;
                sb.append(array[i]).append("+");
                start=array[i];
            }
            array[n-1]=array[n-2]+2;
            sb.append(array[n-1]);
            return sb.toString();
        }
        return null;
    }
    public static void anotherMethod(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long start= n*n-n+1;
        for(int i=1;i<=n;i++){
            if(i==n){
                System.out.println(start);
            }else{
                System.out.print(start+"+");
            }
            start +=2;
        }
    }
}