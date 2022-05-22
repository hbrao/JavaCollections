package com.dancingcloudservices.lesson03;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
    private class Node {
        Node next;
        E data;
    }
    
    private Node head = new Node();

    @Override
    public boolean add(E e) {
        Node newNode = new Node();
        newNode.data = e;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return true;
    }

    @Override
    public void add(int index, E element) {
        Node newNode = new Node();
        newNode.data = element;
        Node before = head;
        int i = index - 1;
        while (i-- >= 0) {
            before = before.next;
        }
        Node after = before.next;
        before.next = newNode;
        newNode.next = after;
    }

    @Override
    public E get(int index) {
        Node n = head;
        int i = index;
        while (i-- >= 0) {
            n = n.next;
        }
        return n.data;
    }

    @Override
    public E set(int index, E element) {
        Node n = head;
        int i = index;
        while (i-- >= 0) {
            n = n.next;
        }
        E old = n.data;
        n.data = element;
        return old;
    }

    @Override
    public E remove(int index) {
        Node before = head;
        int i = index - 1;
        while (i-- >= 0) {
            before = before.next;
        }
        Node thisOne = before.next;
        Node after = thisOne.next;
        before.next = after;
        return thisOne.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList[");
        Node n = head;
        while (n.next != null) {
            n = n.next;
            sb.append(n.data);
            if (n.next != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void clear() {
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
