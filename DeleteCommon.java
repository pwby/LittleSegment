package exam;

import java.util.Scanner;
public class DeleteCommon{
    public static void main(String args[]){
        //建立一个长度为256的数组，用来标记该字符是否出现
        //如果该字符出现过，则弃置
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            String str=DeleteCommonStr(str1,str2);
            System.out.println(str);
        }
    }
    public static String DeleteCommonStr(String str1,String str2){
        boolean[] flag=new boolean[256];
        int i=0;
        while(i<str2.length()){
            int index=str2.charAt(i);
            flag[index]=true;
            i++;
        }
        StringBuilder sb=new StringBuilder();
        int j=0;
        while(j<str1.length()){
            int index=str1.charAt(j);
            if(!flag[index]){
                sb.append((char)index);
            }
            j++;
        }
        return sb.toString();
    }
}
