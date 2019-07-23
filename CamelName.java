package day44;

import java.util.Scanner;

public class CamelName {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '_') {
                    continue;
                } else {
                    if (str.charAt(i - 1) == '_') {
                        char ch = (char) (str.charAt(i) - 32);
                        sb.append(ch);
                    } else {
                        sb.append(str.charAt(i));
                    }

                }
            }
            System.out.println(sb.toString());
        }

    }
}
