/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasdeprioridadacotada;

/**
 *
 * @author danny
 */
public class QueueCola<T> {
    private ClaseCola<T> front;
    private ClaseCola<T> back;
    private int length;

    public QueueCola() {
        front = back = null;
        length = 0;
    }

    public boolean isEmpty() {
        return front == null && length == 0;
    }

    public int length() {
        return length;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }

        if(front == back) {
            back = null;
        }

        T topValue = front.getData();
        front = front.getNext();
        length--;
        return topValue;
    }

    public T front() {
        if(isEmpty()) {
            return null;
        }

        return front.getData();
    }

    public void enqueue(T value) {
        ClaseCola<T> newClaseCola = new ClaseCola<T>(value);
        if(isEmpty()) {
            front = back = newClaseCola;
        } else {
            back.setNext(newClaseCola);
            back = newClaseCola;
        }
        length++;
    }

    @Override
    public String toString() {
        String stackString = "";
        ClaseCola<T> iteratorClaseCola = front;
        while(iteratorClaseCola != null){
            stackString += iteratorClaseCola;
            iteratorClaseCola = iteratorClaseCola.getNext();
        }
        return stackString;
    }
}