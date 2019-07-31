package day48;

import java.util.*;

/**
 * 顺时针打印矩阵
 * 思路：一个长方形套着一个长方形
 * 先打印出最外层的长方形，然后自增自减，打印靠近最外层的长方形，以此类推，直到打印完毕
 * */
public class Printer {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{98, 30, 17}, {96, 38, 90}, {17, 0, 50}, {44, 12, 67}, {12, 79, 43}, {43, 63, 40}, {19, 93, 48}};
        System.out.println(clockwisePrint(mat, 7, 3));
    }

    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code hereif
        int[] rs = new int[n * m];
        int startX = 0;
        int endX = n - 1;
        int startY = 0;
        int endY = m - 1;
        int index = 0;
        while (startX <= endX && startY <= endY) {
            if (endY >= startY) {
                for (int i = startY; i <= endY; i++) {
                    rs[index++] = mat[startX][i];
                }
            }
            if (startX < endX) {
                for (int i = startX + 1; i <= endX; i++) {
                    rs[index++] = mat[i][endY];
                }
            }
            if (startX < endX && startY < endY) {
                for (int i = endY - 1; i >= startY; i--) {
                    rs[index++] = mat[endX][i];
                }
            }
            if (startX < endX && startY < endY) {
                for (int i = endX - 1; i > startX; i--) {
                    rs[index++] = mat[i][startY];
                }
            }
            startX++;
            startY++;
            endX--;
            endY--;

        }
        return rs;

    }


}


