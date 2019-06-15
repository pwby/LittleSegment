package day23;

/**
 * author:byw
 * 数字分类
 */

import java.util.*;

public class DigitalSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int rs1 = 0;
            int rs2 = 0;
            int cover = 0;
            int rs3 = 0;
            int count4 = 0;
            int rs4 = 0;
            int rs5 = 0;
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                switch (temp % 5) {
                    case 0:
                        if(temp%2==0) {
                            rs1 += temp;
                        }
                        break;
                    case 1:
                        rs2 += (int) Math.pow(-1, cover) * temp;
                        cover++;
                        break;
                    case 2:
                        rs3++;
                        break;
                    case 3:
                        rs4 += temp;
                        count4++;
                        break;
                    case 4:
                        if (temp > rs5) {
                            rs5 = temp;
                        }
                        break;
                    default:
                        break;
                }
            }

            System.out.print(rs1 == 0 ? "N " : (rs1 + " "));
            System.out.print(rs2 == 0 ? "N " : (rs2 + " "));
            System.out.print(rs3 == 0 ? "N " : (rs3 + " "));
            if (count4 == 0) {
                System.out.print("N ");
            } else {
                float newRS4 = rs4/ (count4 + 0.0f);
                System.out.print(String.format("%.1f", newRS4) + " ");
            }
            System.out.print(rs5 == 0 ? "N" : (rs5));


        }
    }
}
