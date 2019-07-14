
package day37;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StickTogether{
    public static void OutPut(List<Store> list) {

        if (list.size() >= 3) {
            long max = list.get(0).getLength();
            for (Store s : list) {
                if (s.getLength() > max) {
                    max = s.getLength();
                }
            }
            Store store = new Store();
            store.setOperator(1);
            store.setLength(max);

            for (Store s : list) {
                if (s.getLength() == max) {
                    list.remove(s);
                    break;
                }
            }


            long sum = 0;
            for (Store s : list) {
                sum += s.getLength();
            }
            list.add(store);

            if (sum > max) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        } else {
            System.out.println("No");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Store> list = new ArrayList<>();
        while (sc.hasNext()) {
            int count = sc.nextInt();
            while (count > 0) {
                Store store = new Store();
                int operator = sc.nextInt();
                long length = sc.nextLong();
                store.setOperator(operator);
                store.setLength(length);
                if (operator == 1) {
                    list.add(store);
                    OutPut(list);
                    //  System.out.println(list.size());
                } else {
                    //遍历集合，寻找长度一致的一个
                    for (Store s : list) {
                        if (s.getLength() == length) {
                            // System.out.println(list.size());
                            list.remove(s);
                            // System.out.println(list.size());

                            OutPut(list);
                            // System.out.println(list.size());
                            break;
                        }
                    }
                }
                count--;

            }
        }
    }
}

class Store {
    private int operator;
    private long length;

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}