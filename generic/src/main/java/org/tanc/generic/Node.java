package org.tanc.generic;

public class Node<E> {

    private E data;
    private Node<E> left;
    private Node<E> right;

    public Node() {

    }

    public Node(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    public E getData() {
        return data;
    }
}
