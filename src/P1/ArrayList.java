//package P1;
//
//import java.util.*;
//
//public class ArrayList<E> implements List<E> {
//    private static final  int DEFAULT_CAPACITY = 4;
//    private Object[] elements;
//    private int size;
//
//    public ArrayList(){
//        this.elements = new Object[DEFAULT_CAPACITY]; }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Iterator<E> iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    @Override
//    public <T> T[] toArray(T[] a) {
//        return null;
//    }
//
//    @Override
//    public boolean add(E element){
//        if(this.size == this.elements.length) {
//            this.elements = grow();}
//        this.elements[this.size++]=element;
//        return true;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean contains(E element) {
//        return indexOf(element) !=-1;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends E> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends E> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
////    private Object[] grow() {
////        return new Object[0];
////    }
//
//    @Override
//    public void add(int index, E element){
//        checkIndex(index);
//        insert(index, element);
////        return true;
//    }
//    private void insert(int index, E element){
//        if (this.size == this.elements.length)
//        {
//            this.elements=grow();
//
//        }
//        E lastElement = this.getElement( this.size - 1);
//        for (int i = this.size -1 ; i > index ; i--) {
//            this.elements[i] = this.elements[i-1];
//        }
//        this.elements[this.size]= lastElement;
//        this.elements[index]=element;
//        this.size++;
//    }
//    private void checkIndex(int index){
//        if(index< 0 || index >= this.size){
//            throw new IndexOutOfBoundsException(String.format("Index out of bounds: %d for size :%d", index, this.size));
//        }
//    }
//    @Override
//    public E get(int index){
//        checkIndex(index);
//        return this.getElement(index);
//    }
//    private E getElement(int index) {
//        return (E) this.elements[index];
//    }
//    @Override
//    public E set(int index, E element){
//        checkIndex(index);
//        E oldElement = this.getElement(index);
//        this.elements[index]=element;
//        return oldElement;
//    }
//
//    @Override
//    public E remove(int index){
//        this.checkIndex(index);
//        E element = this.getElement(index);
//        this.elements[index] = null;
//        this.size--;
//        shift(index);
//        ensureCapacity();
//        return element;
//    }
//
//    @Override
//    public int indexOf(Object element) {
//        for (int i = 0; i < size; i++) {
//            if (elements[i].equals(element)){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public ListIterator<E> listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator<E> listIterator(int index) {
//        return null;
//    }
//
//    @Override
//    public List<E> subList(int fromIndex, int toIndex) {
//        return null;
//    }
//
//    private void shift(int index){
//        for (int i = 0; i <= this.size -1; i++) {
//            this.elements[i] = this.getElement(i + 1);
//        }
//    }
//    private void ensureCapacity(){
//        if (this.size < this.elements.length / 3){
//            this.elements = shrink();
//        }
//    }
//    private Object[] grow(){
//        return Arrays.copyOf(this.elements, this.elements.length * 2);
//    }
//    private Object[] shrink(){
//        return Arrays.copyOf(this.elements, this.elements.length / 2);
//    }
//    public String toString(){
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < size; i++) {
//            if (i == size-1){
//                result.append(elements[i]);
//            }else {
//                result.append(elements[i] + "\n");
//            }
//        }
//        return result.toString();
//    }
//
//}
//
//
