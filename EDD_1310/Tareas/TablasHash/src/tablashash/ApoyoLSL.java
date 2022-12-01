/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

/**
 *
 * @author danny
 */

    public class ApoyoLSL<T> {
    private ClaseSOUT<T> head;

    public ApoyoLSL() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        int size = 0;
        ClaseSOUT<T> aux = head;

        while(aux != null) {
            aux = aux.getNext();
            size++;
        }
        return size;
    }

    public int search(T valor) {
        int indexPosition = 0;
        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode != null){
            if(valor.equals(iteratorNode.getData())) {
                return indexPosition;
            }
            iteratorNode = iteratorNode.getNext();
            indexPosition++;
        }
        return -1;
    }

    public T getValue(T valor) {
        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode != null){
            if(valor.equals(iteratorNode.getData())) {
                return iteratorNode.getData();
            }
            iteratorNode = iteratorNode.getNext();
        }
        return null;
    }

    public void addLast(T valor) {
        if(isEmpty()) {
            ClaseSOUT<T> newNode = new ClaseSOUT<>(valor);
            head = newNode;
            return;
        }

        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            iteratorNode = iteratorNode.getNext();
        }
        ClaseSOUT<T> newNode = new ClaseSOUT<>(valor);
        iteratorNode.setNext(newNode);
    }

    public void addFirst(T valor) {
        ClaseSOUT<T> newNode = new ClaseSOUT<>(valor, head);
        head = newNode;
    }

    public void addAfter(T referencia, T valor) {
        if(search(referencia) < 0) return;

        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode.getNext() != null && !referencia.equals(iteratorNode.getData())){
            iteratorNode = iteratorNode.getNext();
        }
        ClaseSOUT<T> newNode = new ClaseSOUT<>(valor, iteratorNode.getNext());
        iteratorNode.setNext(newNode);
    }

    public void deleteAt(int index) {
        if(this.getSize() <= index || isEmpty() || index < 0) return;
        if(index == 0) {
            deleteStart();
            return;
        }

        int indexPosition = 0;
        ClaseSOUT<T> prevNode = null;
        ClaseSOUT<T> iteratorNode = head;

        while(iteratorNode.getNext() != null && indexPosition < index){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
            indexPosition++;
        }
        prevNode.setNext(iteratorNode.getNext());
    }

    public void deleteStart() {
        if(isEmpty()) return;
        head = head.getNext();
    }

    public void deleteLast() {
        if(isEmpty()) return;
        if(getSize() == 1) {
            deleteStart();
            return;
        }
        ClaseSOUT<T> prevNode = null;
        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        prevNode.setNext(null);
    }

    public void deleteValue(T a_eliminar) {
        if(isEmpty()) return;
        ClaseSOUT<T> prevNode = null;
        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode.getNext() != null && !a_eliminar.equals(iteratorNode.getData())){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }

        if(prevNode != null) {
            prevNode.setNext(iteratorNode.getNext());
        } else {
            deleteStart();
        }
    }

    public void update(T a_buscar, T valor){
        if(search(a_buscar) < 0) return;

        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode != null && !a_buscar.equals(iteratorNode.getData())){
            iteratorNode = iteratorNode.getNext();
        }
        if(iteratorNode.getData() != a_buscar) return;
        iteratorNode.setData(valor);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        ClaseSOUT<T> iteratorNode = head;
        while(iteratorNode != null){
            arrrayListString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return arrrayListString;
    }
}

