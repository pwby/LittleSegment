package HomeWork;

import java.util.Stack;

public class Queue {
    Stack<String> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();

    public String pop() {
        //所有元素在stack2中，则返回stack2.pop())
        if (stack1.size() == 0 && stack2.size() == 0) {
            return null;
        }
        if (stack1.size() == 0) {
            return stack2.pop();
        } else {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }

    public void push(String str) {
        //所有元素在stack1中或者stack1也是为空
        if (stack2.size() == 0) {
            stack1.push(str);
        } else {
            //所有元素在Stack2中，将其放入stack1中后，在添加元素
            while (stack2.size() != 0) {
                stack1.push(stack2.pop());
            }
            stack1.push(str);
        }
    }

    public String peek() {
        String rs = pop();
        stack2.push(rs);
        return rs;
    }

}

