package com.dsa6.ch3;

/**
 * author: Raymond, Zhang Yuehua
 * creat : 2023/3/26
 */

public class SinglyLinkedList<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node() {
        }

        public Node(T t) {
            this.data = t;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    void addFirst(T e) {
        // create new node instance to store the element e
        Node<T> newest = new Node<T>(e);
        // set new node's next to reference the old head node
        newest.next = head;
        // set head to reference the new node
        head = newest;
        if (size == 0) {
            tail = head;
        }
        // increment the node count
        size++;
    }

    void addLast(T e) {
        // create new node instance to store the element e
        Node<T> newest = new Node<T>(e);
        // set the next of old tail node reference to the new node
        if (size == 0) {
            head = newest;
        } else {
            tail.next = newest;
        }
        // set tail to reference the new node
        tail = newest;
        // increment the node count
        size++;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size > 0;
    }

    T first() {
        return head.data;
    }

    T last() {
        return tail.data;
    }

    T removeFirst() {
        T ret = head.data;
        head = head.next;
        size--;
        return ret;
    }

//    T removeLast() {
//
//    }
}
