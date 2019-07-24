package day45;

import java.util.Arrays;
import java.util.Scanner;
/**
 * B是否是A的子集：B中的元素存在于A，且A所包含元素的数量大于等于B
 *
 * */
public class subaggregate{
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String[] str = in.nextLine().split(" ");
            char[] str1 = str[0].toCharArray();
            char[] str2 = str[1].toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            String A = String.valueOf(str1);
            String B = String.valueOf(str2);
            if (isContains(A, B)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }


    public static boolean isContains(String A, String B) {

        for (int i = 0; i < B.length(); i++) {
            String s = String.valueOf(B.charAt(i));
            if (!A.contains(s)) {
                return false;
            } else {
                int max = A.lastIndexOf(s) - A.indexOf(s) + 1;
                int count = B.lastIndexOf(s) - B.indexOf(s) + 1;
                if (max >= count) {
                    i = B.lastIndexOf(s);
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}

