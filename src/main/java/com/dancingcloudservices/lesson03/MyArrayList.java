package com.dancingcloudservices.lesson03;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
    @SuppressWarnings("unchecked")
    private E[] data = (E[])(new Object[10]);
    private int count = 0;
    
    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count != 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (data.length < minCapacity) {
            data = Arrays.copyOf(data, minCapacity);
        }
    }
    @Override
    public boolean add(E e) {
        ensureCapacity(count + 1);
        data[count++] = e;
        return true;
    }

    @Override
    public void clear() {
        Arrays.fill(data, 0, count, null);
        count = 0;
    }

    @Override
    public E get(int index) {
        if (index < count && index >= 0) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException(index + " is not a valid index");
        }
    }

    @Override
    public E set(int index, E element) {
        if (index < count && index >= 0) {
            E rv = data[index];
            data[index] = element;
            return rv;
        } else {
            throw new IndexOutOfBoundsException(index + " is not a valid index");
        }
    }

    @Override
    public void add(int index, E element) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException(index + " is not a valid index");
        }
        if (index == count) {
            add(element);
            return;
        }
        ensureCapacity(count + 1);
//        for (int i = count; i > index; ) {
//            data[i] = data[--i];
//        }
        System.arraycopy(data, index, data, index + 1, count - index);
        data[index] = element;
        count++;
    }

    @Override
    public E remove(int index) {
        E rv = get(index);
        System.arraycopy(data, index + 1, data, index, count - index - 1);
        data[count--] = null;
        return rv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList [");
        for (int i = 0; i < count; i++) {
            sb.append(data[i]).append(", ");
        }
        if (count > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
