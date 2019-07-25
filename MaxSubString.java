package 算法;

public class MaxSubString {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum=array[0];
        int maxSum=array[0];
        for(int i=1;i<array.length;i++){
            sum=Math.max(sum+array[i],array[i]);
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}