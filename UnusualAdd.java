package day15;

/**
 * author:byw
 * 另类加法
 */
public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        int xor,and;
        while(B!=0){
            xor = A^B;
            and = (A&B)<<1;
            A=xor;
            B=and;
        }
        return A;
    }
}