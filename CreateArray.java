package day11;

/**
 * author:byw
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
 */
public class CreateArray {
    public int[] multiply(int[] A) {
        int B[] = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            boolean flag = false;
            B[i] = 1;
            for (int j = 0; j < A.length; j++) {
                int temp = 1;
                if (i == j) {
                    flag = true;
                    int k = A[j];
                    A[j] = temp;
                    temp = k;
                }
                B[i] *= A[j];
                if (flag) {
                    flag = false;
                    A[j] = temp;
                    temp = 1;
                }
            }
        }
        return B;
    }
}