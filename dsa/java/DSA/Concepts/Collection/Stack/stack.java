package DataStructures.Collection.Stack;

import java.util.Stack;

/*
stack.push(element)
element = stack.pop()
element = stack.peek()
stack.clear()
boolean = stack.empty()
pos_from_top = stack.search(element); else -1
*/

public class stack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();

        stack1.push(1);
        stack1.push("Hello");
        stack1.push(1.34);

        System.out.println(stack1);

        Stack<String> stack2 = new Stack<>();
        stack2.push("H");
        stack2.push("e");
        stack2.push("l");
        stack2.push("l");
        stack2.push("o");

        String hello = String.join("", stack2);
        System.out.println(stack2);
        System.out.println(hello);

        String element = stack2.peek();
        System.out.println("Peek = " + element);

        String remove_top = stack2.pop();
        System.out.println("Pop elem = " + remove_top);
        String new_hello = String.join("", stack2);
        System.out.println("After pop = " + new_hello);

        stack1.clear();
        System.out.println(stack1);

        System.out.println(stack1.empty());

        int pos_from_top = stack2.search("l");
        System.out.println("Pos = " + pos_from_top);
    }
}
