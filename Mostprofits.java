package 算法;

public class Mostprofits {

        /**
         * @param m: An integer m denotes the size of a backpack
         * @param A: Given n items with size A[i]
         * @param V: Given n items with value V[i]
         * @return: The maximum value
         */
        public int backPackII(int m, int[] A, int[] V) {
            // write your code here
            if(m==0){
                return 0;
            }
            int result[][]=new int[A.length+1][m+1];
            for(int col=0;col<m+1;col++){
                result[0][col]=0;
            }
            for(int row=0;row<A.length+1;row++){
                result[row][0]=0;
            }
            for(int row=1;row<A.length+1;row++){
                for(int col=1;col<m+1;col++){
                    if(A[row-1]>col){
                        result[row][col]=result[row-1][col];
                    }else{
                        int load=result[row-1][col-A[row-1]]+V[row-1];
                        result[row][col]=Math.max(load,result[row-1][col]);

                    }
                }
            }
            return result[A.length][m];


        }
    }

