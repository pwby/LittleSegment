
package day38;

public class Replacement {
    public static void main(String[] args) {
        String s=replaceMent("tr e w  ",8);
        System.out.println(s);
    }
    public String replaceSpace(String iniString, int length) {
        // write code he
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (String.valueOf(iniString.charAt(i)).equals(" ")) {
                count++;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        String[] strs = iniString.split(" ");
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                sb.append(strs[i].charAt(j));
            }
            if (i != strs.length - 1) {
                sb.append("%20");
            }
        }
        while (count > 0) {
            sb.append("%20");
            count--;
        }

        return sb.toString();
    }
    public static String replaceMent(String iniString, int length){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<length;i++){
            char str=iniString.charAt(i);
            if(str==' '){
                sb.append("%20");
            }else{
                sb.append(str);
            }
        }

        return sb.toString();
    }
}