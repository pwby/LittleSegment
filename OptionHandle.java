package day24;

/**
 * author:byw
 *
 * 输入包括多组测试数据。
 * 每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
 * 学生ID编号从1编到N。
 * 第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
 * 接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
 * 当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。
 *
 *
 * 输出描述:
 * 对于每一次询问操作，在一行里面输出最高成绩.
 *
 *
 * 示例1
 *
 *
 *
 * 输入
 *
 * 5 7
 * 1 2 3 4 5
 * Q 1 5
 * U 3 6
 * Q 3 4
 * Q 4 5
 * U 4 5
 * U 2 9
 * Q 1 5
 *
 *
 *
 *
 * 输出
 *
 * 5
 * 6
 * 5
 * 9
 *
 * 我的错误：排序会打乱原来学生的分组，所以在求最大值时不能排序
 */

import java.util.Arrays;
import java.util.Scanner;

public class OptionHandle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int NStudent=sc.nextInt();
            int[] stuScore=new int[NStudent];
            int NOperator=sc.nextInt();
            for(int i=0;i<NStudent;i++){
                stuScore[i]=sc.nextInt();
            }
            for(int i=0;i<NOperator;i++){
                String commond=sc.next();
                if(commond.equals("Q")){

                    int A=sc.nextInt();
                    int B=sc.nextInt();
                    int fromIndex=Math.min(A,B);
                    int toIndex=Math.max(A,B);
                    int[] newarr=Arrays.copyOfRange(stuScore,fromIndex-1,toIndex);
                    Arrays.sort(newarr);
                    System.out.println(newarr[newarr.length-1]);
                }
                if(commond.equals("U")){
                    int fromIndex=sc.nextInt();
                    int updateScore=sc.nextInt();
                    stuScore[fromIndex-1]=updateScore;
                }
            }

        }
    }
}
