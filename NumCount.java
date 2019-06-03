package day11;
import java.util.Scanner;
/**
 * 给一个数字，统计不同数字出现的个数
 * */
public class NumCount {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //a数组统计不同数字出现的次数
            int[] a = new int[10];
            String n = in.next();
            for (int i = 0; i < n.length(); i++)
                //数组下标代表该数字，对应下标的数组值代表该数字出现的个数
                a[n.charAt(i) - '0']++;
            for (int i = 0; i < a.length; i++)
                if (a[i] != 0)
                    System.out.println(i + ":" + a[i]);
        }
    }


