package day1;

import java.util.Scanner;

/**
 * author:byw
 * 1.统计回文
 * “回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。花花非常喜欢这种拥有
 * 对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。现在她非常好奇有没有办法将字符
 * 串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，帮助她寻找有多少种插入办法可以使新
 * 串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
 */
public class Plalindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        //method1(A,B)
        //method2(A,B)
    }

    /**
     * 方法二1.插入字符
     */
    public static void method2(String A, String B) {
        String str = B + A;
        char[] strs = str.toCharArray();
        int BPosition = B.length() - 1;
        int swapCount;
        int count = 0;
        while (BPosition < strs.length) {
            swapCount = B.length();
            if (ReverseString(String.valueOf(strs))) {
                count++;
            }
            if (BPosition == strs.length - 1) {
                break;
            }
            //交换
            if (BPosition < strs.length - 1) {
                int temp = BPosition;
                while (swapCount > 0) {
                    swap(strs, temp, temp + 1);
                    temp--;
                    swapCount--;
                }
                BPosition++;
            }
        }
        System.out.println(count);
    }

    /**
     * 交换
     */
    static void swap(char[] strs, int src, int des) {
        char temp = strs[des];
        strs[des] = strs[src];
        strs[src] = temp;

    }

    /**
     * 方法一:插入字符
     */
    public static void method1(String A, String B) {

        char[] strA = A.toCharArray();
        int count = 0;
        for (int i = 0; i <= strA.length; i++) {
            StringBuffer sb = new StringBuffer(A);
            sb.insert(i, B);
            if (ReverseString(sb.toString())) {
                count++;
            }
        }
        System.out.println(count++);
    }

    /**
     * 2.写出判断回文的方法
     */
    public static boolean ReverseString(String str) {
        char[] strs = str.toCharArray();
        int left = 0;
        int right = strs.length - 1;
        while (left < right) {
            if (strs[left] == strs[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

}
