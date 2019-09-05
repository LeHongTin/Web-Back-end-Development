package Exercise;

import sun.jvm.hotspot.debugger.posix.elf.ELFException;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] element = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        E[] element =(E[]) new Object[capacity];
    }

    public void add (int index, E e) {
           for(int i = size - 1; i > index; i--) {
               element[i+1] = element[i];
               element[index] = e;
           }
    }

    public void addLast (E e) {
        if(size >= element.length){
            ensureCapacity(10);
        }
        element[size] = e;
        size ++;
    }

    public E remove (int index) {

        E e = (E) element[index];

        for(int i = index; i < size -1; i++) {
            element[i] = element[i+1];
        }
        element[size - 1] = null;
        size -- ;
        return e;

    }

    public int size() {
        return size;
    }

    public E clone(){
        return (E)element;
    }

    public boolean contains(E e) {
        for(int i = 0; i < size ; i++) {
            if(e.equals(element[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for( int i = 0; i < size; i ++) {
            if(e.equals(element[i])) {
                return i;
            }
        }
        return - 1;
    }

    public boolean add(E e) {
        if(element.length < size) {
            addLast(e);
            return true;
        }
        return false;
    }

    public void ensureCapacity(int minCapacity){
        E[] newElement = (E[])new Object[size + minCapacity];
        System.arraycopy(element,0,newElement,0,size);
        element = newElement;
    }

    public E get(int i) {
        return element[i];
    }

    public void clear() {
        element =(E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
