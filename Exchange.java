package day12;

import java.util.Arrays;
import java.util.HashMap;

/**
 * author:byw
 * 交换数据
 */
public class Exchange {
   public int[] exchange(int[] AB){
        AB[0] ^= AB[1];
        AB[1] ^=AB[0];
        AB[0] ^=AB[1];
        return AB;
   }
}

