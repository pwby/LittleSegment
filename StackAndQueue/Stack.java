package HomeWork;

import java.util.LinkedList;
import java.util.Queue;

class Stack {
    LinkedList<String> queue1 = new LinkedList<>();
    LinkedList<String> queue2 = new LinkedList<>();

    public void push(String n) {
        //两个队列都为空
        //第一个队列不为空，第二个队列为空

        //第二个队列不为空，第一个队列为空
        while (queue2.size() > 0) {
            queue1.push(queue2.pop());
        }
        queue1.push(n);


    }

    public String poll() {
        //两个队列为空
        if (queue1.size() == 0 && queue2.size() == 0) {
            return null;
        }

        //队列1为空，队列2不为空
        if (queue1.size() == 0) {

            while (queue2.size() > 1) {
                queue2.push(queue2.pop());
            }
            return queue2.pop();
        }
        //队列1不为空，队列2为空
        if (queue2.size() == 0) {
            while (queue1.size() > 1) {
                queue2.push(queue1.pop());
            }
            return queue1.pop();
        }
        return null;
    }
}
