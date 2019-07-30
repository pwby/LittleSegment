package day48;

import java.util.*;
/**
 * 将数组划分为两半，求用左边数组的最大值-右边数组的最大值 的绝对值的最大值
 * 当最大值在左边时，右边的A[n-1]被划分为右数组，且作为右边数组的最大值（如果不选A[n-1],则可能会有比A[n-1]更大的值，所以选择A[n-1])
 * 当最大值在右边时，左边的A[0]被划分为左数组，且作为左边数组的最大值（如果不选A[0],则可能会有比A[0]更大的值，所以选择A[0]
 * 当最大值在中间时，选取max（max-A[0]，max-A[n-1]）
 *  */
public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        int max=0;
        for(int i=0;i<n;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        int ans1=max-A[0];
        int ans2=max-A[n-1];
        return (ans1>ans2 ? ans1 : ans2 );
    }
}
