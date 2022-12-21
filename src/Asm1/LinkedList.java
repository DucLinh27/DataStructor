package Asm1;

public interface LinkedList<E> extends Iterable<E> {
    void addFirst(E element);

    void addLast(E element);

    E removeFisrt();

    E removeLast();

    E getFirst();

    E getLast();

    int sizve();

    boolean isEmpty();

}
