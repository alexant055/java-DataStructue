package ds;

/*
    Each element linked to/ reference to  next element - The elements changed together
    List Data Structures - they can store multiple elements as a list
    First Element in the list called the "HEAD"
    Last Element points to NULL
*/

import java.util.NoSuchElementException;

public class LinkedListClass {

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);

        ll.addFirst(5);

        System.out.println(ll.indexOf(40));

        System.out.println(ll.contains(30));

        ll.removeFirst();

        ll.removeLast();
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;

    }

    private Node getPreviousNode(Node node) {
        Node previous = first;
        while (previous != null) {
            if (previous.next == node) return previous;
            previous = previous.next;
        }
        return null;
    }

    public void removeLast() {

        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        Node previous = getPreviousNode(last);
        last = previous;
        last.next = null;
    }

    public boolean contains(int data) {
        return indexOf(data) != -1;
    }

    public int indexOf(int data) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.data == data) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void addFirst(int data) {
        Node node = new Node(data);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
}

