package day14;

/**
 * author:byw
 */
import java.util.Scanner;
public class lowestNum{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] str = sc.nextLine().split(" ");
            StringBuffer sb = new StringBuffer();
            int lenstr1 = Integer.valueOf(str[1]) - 0;
            int lenstr0 = Integer.valueOf(str[0]) - 0;
            sb.append(1);
            lenstr1 = lenstr1 - 1;
            while (lenstr0 > 0) {
                sb.append(0);
                lenstr0--;
            }
            while (lenstr1 > 0) {
                sb.append(1);
                lenstr1--;
            }
            for (int index = 2; index < str.length; index++) {
                int len = Integer.valueOf(str[index]) - 0;
                while (len > 0) {
                    sb.append(index);
                    len--;

                }
            }
            System.out.println(sb.toString());
            // methodanother();
        }
    }

    public static void methodanother(){
        Scanner in=new Scanner(System.in);
        int[] num=new int[10];
        for(int i=0;i<10;i++){
            //在一行输入空格分开输入所有的数字或者换行输入度可以
            num[i]=in.nextInt();
        }
        System.out.print(1);
        num[1]--;
        while(num[0]>0) {
            System.out.print(0);
            num[0]--;
        }

        for(int i= 1;i<10;i++){
            while(num[i]!=0){
                System.out.print(i);
                num[i]--;
            }
        }

    }
}
