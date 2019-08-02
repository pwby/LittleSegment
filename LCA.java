package day38;

import java.util.*;

public class LCA {
    public int getLCA(int a, int b) {
        if (a == b) return a;
        while (a != b) {
            a = a > b ? a >> 1 : a;
            b = b > a ? b >> 1 : b;
        }
        return a;
    }
}
