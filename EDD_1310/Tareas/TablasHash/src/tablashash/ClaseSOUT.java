/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

/**
 *
 * @author danny
 */
public class ClaseSOUT<T> {
    private T data;
    private ClaseSOUT<T> next;

    public ClaseSOUT() {
    }

    public ClaseSOUT(T valor) {
        this.data = valor;
    }

    public ClaseSOUT(T data, ClaseSOUT<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ClaseSOUT<T> getNext() {
        return next;
    }

    public void setNext(ClaseSOUT<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data + ", ";
    }
}
