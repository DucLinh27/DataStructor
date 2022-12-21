package Asm1;

import CodeP3.Student;

import java.util.Iterator;

public class SinglyLinkedList<E> implements LinkedList<E> {
    Node<E> head, tail;
    int size;

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public Node(E element) {
            this(element, null);
        }


    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E removeFisrt() {
        ensureNonEmpty();
        E data = head.element;
        head = head.next;
        size--;
        return data;
    }

    public E removeLast() {
        ensureNonEmpty();
        E data = tail.element;
        Node<E> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
        return data;
    }

    @Override
    public E getFirst() {
        return head.element;
    }

    @Override
    public E getLast() {
        return tail.element;
    }

    @Override
    public int sizve() {
        return 0;
    }

//    @Override
//    public int size() {
//        return size;
//    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureNonEmpty() {
        if (size == 0) {
            throw new IllegalMonitorStateException("Linked List is Empty");
        }
    }

    public String toString() {
        Node<E> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.element + "\n");
            current = current.next;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedList<Student> employeeSinglyLinkedList = new SinglyLinkedList<>();

    }
}
