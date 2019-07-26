package day46;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class HalfNum {
    public static void main(String args[]) {
        int[] array = new int[]{2, 2, 3, 2, 4, 2, 5, 2, 3};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer temp = map.get(array[i]);
            if (temp == null) {
                temp = 1;
                map.put(array[i], temp);
            } else {
                map.put(array[i], temp + 1);
            }
            if (map.get(array[i]) > array.length / 2) {
                return array[i];
            }
        }
        return 0;
    }


    public int MoreThanHalfNum_Solutio(int[] array) {
         Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = i;
            while (temp < array.length && array[i] == array[temp]) {
                count++;
                temp++;
            }
            if (count > max) {
                max = count;

                i = temp - 1;
            }
            count = 0;
        }
        System.out.println(count);
        if (max > array.length / 2) {
            return array[array.length / 2];
        }
        return 0;

    }
}
