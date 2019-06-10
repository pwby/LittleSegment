package day19;

/**
 * author:byw
 * 成绩排序
 * 输入
 * 3
 * 0
 * fang 90
 * yang 50
 * ning 70
 * 输出
 * fang 90
 * ning 70
 * yang 50
 */

import java.util.*;

public class Sort {
    static class Info {

        private String name;
        private int score;

        public Info(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String toString() {
            return this.name + " " + this.score;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int option = sc.nextInt();
            List<Info> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                Info info = new Info(sc.next(), sc.nextInt());
                list.add(info);
            }
            /*第一种方法
             * 采用插入排序的算法
             * 不会破坏相同数字原本的顺序
             * */
            if (option == 0) {
                //降序
                for (int i = 1; i < N; i++) {
                    int j = i - 1;
                    Info info = list.get(i);
                    for (; j >= 0 && info.getScore() > list.get(j).getScore(); j--) {
                        list.set(j + 1, list.get(j));
                    }
                    list.set(j + 1, info);
                }
            } else {
                for (int i = 1; i < N; i++) {
                    int j = i - 1;
                    Info info = list.get(i);
                    for (; j >= 0 && info.getScore() < list.get(j).getScore(); j--) {
                        list.set(j + 1, list.get(j));
                    }
                    list.set(j + 1, info);
                }
            }
            for (Info info : list) {
                System.out.println(info);
            }
        }
    }

    /*
    第二种方法
     *使用比较器，对集合中的元素进行排序
     * 使用Collections.sort(List<T> list)的前提，列表中的元素都实现了Comparator接口
     * 所以使用Collections.sort(List<T> list，new Comparator<T>{
     * public void compute(T t1,T t2){}});比较器默认为升序排列
     * */
    public void method2() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int numPeople = scanner.nextInt();
            int option = scanner.nextInt();
            List<Student> stuList = new ArrayList<Student>();
            for (int i = 0; i < numPeople; i++) {
                stuList.add(new Student(scanner.next(), scanner.nextInt()));
            }
            if (option == 0) {
                Collections.sort(stuList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o2.score - o1.score;//
                    }
                });
            } else {
                Collections.sort(stuList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;//默认按照升序排列
                    }
                });
            }

            for (int i = 0; i < stuList.size(); i++) {
                System.out.println(stuList.get(i).name + " " + stuList.get(i).score);
            }
        }
    }
}
class Student {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}