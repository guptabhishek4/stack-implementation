package com.stackimpl;

public class StackImpl {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.traverse();

        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.traverse();

        stack.pop();
        stack.pop();
        stack.traverse();

        stack.getTop();
        stack.getMinimumElement();
    }
    
}
