package day1;

import java.util.HashMap;
import java.util.Map;

/**
 * author:byw
 * 有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
 * 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
 */
 class Finder {

    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n - 1, K);
    }

    public int findKth(int[] a, int low, int high, int k) {
        int part = partation(a, low, high);
        if (k == part - low + 1) return a[part];
        else if (k > part - low + 1) return findKth(a, part + 1, high, k - part + low - 1);
        else return findKth(a, low, part - 1, k);
    }

    public int partation(int[] a, int low, int high) {
        int key = a[low];
        while (low < high) {
            while (low < high && a[high] <= key) high--;
            a[low] = a[high];
            while (low < high && a[low] >= key) low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
}

/**
 * 我的寻找方法
 * 1.将数组升序排列
 * 2.从数组最后一个下标遍历，封装到map中
 * 3.根据对应的k值（第几大）返回对应的值
 */
class MyFinder {
    public int findKth(int[] a, int n, int K) {
        quickSort(a, 0, a.length - 1);
        int[] list = fun(a).get(K);
        return list[0];
    }

    /**
     * 排序
     * 采用分治算法
     */
    public void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = Sort(a, left, right);
        quickSort(a, left, pivot - 1);
        quickSort(a, pivot + 1, right);
    }

    /**
     * 挖坑排序
     * 1.以最右面的值作为基准值
     * 2.比基准值小的放在左面，比基准值大的放在右面
     * 3.直到比较完毕返回基准值所在的下标
     */
    public int Sort(int[] a, int left, int right) {

        int begin = left;
        int end = right;
        int key = a[right];
        while (begin < end) {
            if (a[begin] <= key) {
                begin++;
            }
            a[end] = a[begin];
            if (a[end] >= key) {
                end--;
            }
            a[begin] = a[end];
        }
        a[begin] = key;
        return begin;
    }

    /**
     * 用线性表封装
     * （我的问题：数组空间太小，所以数组使用空间大一点的）
     */
    public Map<Integer, int[]> fun(int[] a) {

        Map<Integer, int[]> map = new HashMap<>();

        for (int k = 1; k <= a.length; k++) {
            //数组空间大一点
            int[] storeArray = new int[1024];
            int j = 0;
            int max = a[a.length - k];
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i] >= max) {
                    storeArray[j++] = max;
                }
            }
            map.put(k, storeArray);
        }
        return map;
    }
}
