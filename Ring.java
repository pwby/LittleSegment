package Day3;

import java.util.ArrayList;

/**
 * author:byw
 * 约瑟夫环问题
 */
class Ring {
    /**
     * 方法一
    * */
    public static int findLastNumber(int n, int m) {
        if (n < 1 || m < 1) return -1;
        int[] array = new int[n];
        int i = -1, step = 0, count = n;
        while (count > 0) {
            //编号
            i++;
            //从头开始，循环
            if (i >= n) i = 0;
            //从删除元素处开始
            if (array[i] == -1) continue;
            //步长
            step++;
            if (step == m) {
                array[i] = -1;
                step = 0;
                count--;
            }
        }
        //返回
        return i;
    }

    /**
     * 方法二:公式法
     * */
    public static int method2(int n,int m){
                ArrayList<Integer> list = new ArrayList<>();
                if(n<1 || m<1)
                    return -1;
                for(int i=0; i<n; i++)
                    list.add(i);
                int count=0;
                while(list.size()>1){
                    int goal = (count+m-1)%list.size();
                    list.remove(goal);
                    count = goal;
                }
                return list.get(0);
            }
        }
