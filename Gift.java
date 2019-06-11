package day20;

import java.util.Arrays;

/**
 * author:byw
 * 微信红包：打印出数组中出现次数超过数组长度一半的元素
 */
import java.util.*;

public class Gift {
    public static void main(String args[]) {
        int gifts[] = new int[]{3, 2, 3, 5, 3, 6, 3, 7, 3, 0, 3, 3, 5, 3};
        System.out.println(new Gift().getValue(gifts, gifts.length)
        );

    }

    public int getValue(int[] gifts, int n) {

        int max = n / 2;
        int rs = 0;
        Arrays.sort(gifts);
        int count=0;
        //出现红包次数最多的元素超过数组的一半长度
        int more=gifts[n/2];
        for(int i=0;i<n;i++){
            if(gifts[i]==more){
                count++;
            }
        }
        return count > n / 2 ? more : 0;

    }
}