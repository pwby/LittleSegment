package day36;

import java.util.Scanner;

/**
 * 将16进制转换为10进制
 */
public class convert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long rs = 0;
            char[] ch = in.nextLine().toUpperCase().toCharArray();
            //使用公式
            for (int i = ch.length - 1; i >= 0; i--) {
                int z = ch.length - 1 - i;
                int num = num(ch[i]);
                if (num != -1) {
                    rs += num * Math.pow(16, z);
                }
            }
            System.out.println(rs);

        }
    }

    /**
     * 确定每一位所代表的数字
     * */
    public static int num(char i) {
        if (i >= '0' && i <= '9') {
            return i - '0';
        } else if (i >= 'A' && i <= 'F') {
            return i - 'A' + 10;
        } else {
            return -1;
        }
    }
}
