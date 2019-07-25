package 算法;

import java.util.ArrayList;

public class triangele {

        public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
            int line=triangle.size();
            for(int i=triangle.size()-2;i>=0;i--){

                for(int j=0;j<=i;j++){
                    int element=Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1))+
                            triangle.get(i).get(j);
                    triangle.get(i).set(j,element);
                }
            }
            return triangle.get(0).get(0);
        }
    }

