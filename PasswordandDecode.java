package  day42;
import java.util.Arrays;
import java.util.Scanner;
/**
* 加密解密
* */
public class PasswordandDecode{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            char[] str1s=str1.toCharArray();
            char[] str2s=str2.toCharArray();
            enCryption(str1s);
            deCryption(str2s);
            System.out.println(String.valueOf(str1s));
            System.out.println(String.valueOf(str2s));
        }
    }
    public static char deCryption(char c){
        if(c >= 'B' && c<= 'Z' ){
            return  c= (char)(c - 1 + 32);
        }
        if(c == 'A'){
            return   c = 'z';
        }
        if(c >= 'b' && c <= 'z' ){
            return   c = (char)(c - 1 - 32);
        }
        if(c == 'a'){
            return  c = 'Z';
        }

        if(c >= '1' && c <= '9'){
            return  c = (char)(c - 1);
        }
        if(c == '0'){
            return c = '9';
        }
        return c;
    }
    public static char enCryption(char c){
        if(c >= 'A' && c<= 'Y' ){
           return  c= (char)(c + 1 + 32);
        }
        if(c == 'Z'){
           return   c = 'a';
        }
        if(c >= 'a' && c <= 'y' ){
         return   c = (char)(c + 1 - 32);
        }
        if(c == 'z'){
          return  c = 'A';
        }

        if(c >= '0' && c <= '8'){
          return  c = (char)(c + 1);
        }
        if(c == '9'){
           return c = '0';
        }
        return c;
    }
    public static void enCryption(char[] str1s){
        for(int i=0;i<str1s.length;i++){
           str1s[i]=enCryption(str1s[i]);
        }
    }
    public static void deCryption(char[] str2s){
        for(int i=0;i<str2s.length;i++){
           str2s[i]=deCryption(str2s[i]);
        }
    }

}
    
    