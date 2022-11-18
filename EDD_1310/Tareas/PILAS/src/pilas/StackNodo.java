/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author danny
 */
public class StackNodo<T> {
    private Nodo<T> top;
    private int length;

    public StackNodo() {
        top = null;
        length = 0;
    }

    public boolean isEmpty() {
        return top == null && length == 0;
    }

    public int length() {
        return length;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T topValue = top.getData();
        top = top.getNext();
        length--;
        return topValue;
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }

        return top.getData();
    }

    public void push(T value) {
        Nodo<T> newNode = new Nodo<T>(value);
        newNode.setNext(top);
        top = newNode;
        length++;
    }

    @Override
    public String toString() {
        String stackString = "";
        Nodo<T> iteratorNode = top;
        while(iteratorNode != null){
            stackString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return stackString;
    }
}
