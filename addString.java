
//两个字符串相加


    public static String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1, len2 = num2.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (len1 >= 0 || len2 >= 0) {
            int n1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int n2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int temp = n1 + n2 + carry;
            carry = temp / 10;
            sb.append(temp % 10);
            len1--;
            len2--;
        }
        return carry > 0 ? sb.append(carry).reverse().toString() : sb.reverse().toString();

    }

import java.math.BigInteger;
class Solution {
 
 public static  String addStrings(String num1, String num2) {

             BigInteger bigInteger1=new BigInteger(num1);
             BigInteger bigInteger2=new BigInteger(num2);
           return   bigInteger1.add(bigInteger2).toString();

    }
}