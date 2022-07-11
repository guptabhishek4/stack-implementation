package com.stackimpl;

public class Stack {

    private Node top;
    private int minElement;


    public Stack() {
        /*at start stack would be initialized as null so, top would be null */
        top = null;
    }

    public void push(int item) {
        Node newNode = new Node();
        newNode.data = item;
        if (top == null) {
            /*if the stack is empty*/
            newNode.next = null;
            minElement = item;
            
        } else if (item > minElement) {
            newNode.next = top;
            top = newNode;
        } else {
            newNode.next = top;
            top.data = (2 * item - minElement);
            minElement = item;
        }
        top = newNode;
    }

    public void pop() {
        /*if the top is empty*/
        if(top == null) {
            System.out.println("Stack is empty or underflow");
            return;
        }
        
        if(top.data < minElement) {
            minElement = (2*minElement - top.data);
        }

        Node temp;
        temp = top;
        top = top.next;
        System.out.println("Element popped: " + temp.data);
    }

    public void traverse() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data+" ");
            current = current.next;
        }
    }
    
    public void getTop() {
        if(top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    public void getMinimumElement() {
        if(top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Minimum element is: " + minElement);
        }
    }
}
