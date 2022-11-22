/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author danny
 */
public class ClaseCola<T> {
    private T data;
    private ClaseCola<T> next;

    public ClaseCola() {
    }

    public ClaseCola(T valor) {
        this.data = valor;
    }

    public ClaseCola(T data, ClaseCola<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ClaseCola<T> getNext() {
        return next;
    }

    public void setNext(ClaseCola<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  data + ", ";
    }
}
