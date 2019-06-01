package day10;

/**
 * author:byw

 * Fibonacci数列是这样定义的：
 * F [0] = 0
 * F [1] = 1
 * 每个i≥2：F [i] = F [i-1] + F [i-2]
 * 因此，Fibonacci数列就形如：0,1,1,2,3,5,8,13，...，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个斐波那契数，每一步你可以把当前数字X变为X-1或者X + 1，现在给你一个数ñ求最少需要多少步可以变为斐波那契数。
 *
 * 输入描述：
 * 输入为一个正整数N（1≤N≤1,000,000）
 *
 * 输出描述：
 * 输出一个最小的步数变为斐波那契数”
 * 示例1
 * 输入
 * 15
 * 输出
 * 2
 */

import java.util.Scanner;
public class Fibonacii{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int N=sc.nextInt();
            int X1=0;
            int X2=1;
            int fi=0;
            //直到fi大于N时跳出循环，此时fi介于N与X1（距离fi最近的小于fi的数）之间
           while(fi < N){
                 fi =X1 + X2;
                 X2=X1;
                 X1=fi;
            }
            System.out.println(N-X1 < fi-N ? N-X1 : fi-N);
        }

    }
}
