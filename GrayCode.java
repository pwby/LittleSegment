package day12;

/**
 * author:byw
 * 打印格雷码
 */
import java.util.*;
public class GrayCode {
    public String[] getGray(int n){
        if(n==0){
            return null;
        }else if(n==1){
            String[] s = new String[2];
            s[0] = "0";
            s[1] ="1";
            return s;
        }else{
            String[] s = new String[(int) Math.pow(2,n)];
            String[] sd = getGray(n-1);
            for(int index = 0;index < s.length / 2;index++){
                StringBuffer sb = new StringBuffer();
                sb.append(0).append(sd[index]);
                s[index]=sb.toString();
                sb.delete(0,sb.length());
                s[s.length-index-1] = sb.append(1).append(sd[index]).toString();
            }
            return s;
        }

    }

}