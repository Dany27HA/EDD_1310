/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;
import java.util.ArrayList;
/**
 *
 * @author danny
 * @param <T>
 */
    public class ConjuntosADT <T> implements Iterable<T>{
    ArrayList<T> data = new ArrayList<>();

    public int length() {
        return data.size();
    }

    public boolean contains(T value) {
        return data.indexOf(value) != -1;
    }

    public void add(T value) {
        if(!contains(value)) {
            data.add(value);
        }
    }

    public void remove(T value) {
        data.remove(value);
    }

    public boolean equals(ConjuntosADT<T> other) {
        if(length() != other.length()) {
            return false;
        }
        for(int i = 0; i < length(); i++) {
            if(!other.contains(data.get(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean isSubset(ConjuntosADT<T> other) {
        if(length() > other.length()){
            return false;
        }
        for(int i = 0; i < length(); i++) {
            if(!other.contains(data.get(i))) {
                return false;
            }
        }
        return true;
    }
    public void union(ConjuntosADT<T> other) {
        for(int i = 0; i < other.length(); i++) {
            add(other.data.get(i));
        }
    }
    public ConjuntosADT<T> intersection(ConjuntosADT<T> other) {
        ConjuntosADT<T> result = new ConjuntosADT();
        for(int i = 0; i < length(); i++) {
            if(other.contains(data.get(i))) {
                result.add(data.get(i));
            }
        }
        return result;
    }
    public ConjuntosADT<T> difference(ConjuntosADT<T> other) {
        ConjuntosADT<T> result = new ConjuntosADT();
        for(int i = 0; i < length(); i++) {
            if(!other.contains(data.get(i))) {
                result.add(data.get(i));
            }
        }
        for(int i = 0; i < other.length(); i++) {
            if(!contains(other.data.get(i))) {
                result.add(other.data.get(i));
            }
        }
        return result;
    }
    @Override
    public String toString() {
        return data.toString();
    }
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < data.size();
            }
            @Override
            public T next() {
                return data.get(index++);
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

