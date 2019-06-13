package day19;

import java.util.ArrayList;
import java.util.List;

/**
 * author:byw
 * lambda格式
 * (参数) -> {方法体}
 * 方法体中只有一行语句时大括号省略，不需要return语句
 * 1，一个lambda表达式是一个带参数的代码块
 * 2，当你想要代码块在以后的某个时间点执行，就可以使用lambda表达式
 * 3，lambda表达式可以被转换为函数式接口
 * 4，lambda表达式可以在闭包作用域中有效的访问final变量
 * 5，方法和构造器引用可以引用构造器和方法，但无效调用他们，我们使用这种新的语法编码更加的简单。
 */
public class TestLambda {
    public static void main(String args[]){
        //单行语句
        Thread t1=new Thread(()->System.out.println(1));
        //多行语句
        Thread t2=new Thread(()->{
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        });
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("D");
        list.add("C");
        list.add("B");
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
        t1.start();
        t2.start();

    }
}
