package com.dsa6.ch3.linkedList;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/4/2
 */

public class DoublyLinkedList<T> {
    private static class Node<T> {

        private T data;
        private Node<T> prev;
        private Node<T> next;

        public Node() {
        }

        public Node(T t, Node<T> p, Node<T> n) {
            data = t;
            prev = p;
            next = n;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = new Node<>(null, null,null);
        tail = new Node<>(null, head, null);
        head.next = tail;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size <= 0;
    }


    T first() {
        if(isEmpty()) {
            return null;
        }
        return head.data;
    }


    T last() {
        if(isEmpty()) {
            return null;
        }
        return tail.data;
    }

    /**
     * add new element after head
     * @param e the new value of the insertion node
     */
    void addFirst(T e) {
        addBetween(e, head, head.next);
    }

    /**
     * add new element before tail
     * @param e the new value of insertion node
     */
    void addLast(T e) {
        addBetween(e,tail.prev, tail);
    }

    /**
     * add new element after prev but before next, prev and next should be linked to each other
     * @param e the value will be inserted into the list
     * @param prev after the insertion, the prev node of the new value
     * @param next after the insertion, the next node of the new value
     */
    void addBetween(T e, Node<T> prev, Node<T> next) {
        assert(prev.next == next);
        assert(next.prev == prev);

        Node<T> newest = new Node<>(e, prev, next);
        prev.next = newest;
        next.prev = newest;
        size++;
    }

    /**
     * remove the node and return it
     * @param node the node will be removed from the list
     * @return the data field of the removed node
     */
    T remove(Node<T> node) {
        Node<T> prev = node.prev;
        Node<T> next = node.next;

        prev.next = next;
        next.prev = prev;
        size--;
        return node.data;
    }

}
