package lab7;

import java.util.*;

public class CustomArrayList<T> extends AbstractCollection implements List {
    private Object[] array;
    private int capacity;
    private int size = 0;

    public CustomArrayList() {
        capacity = 10;
        array = new Object[10];
    }

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    @Override
    public Iterator iterator() {
        return new CustomArrayListIterator(this);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, Object element) {
        if (index >= capacity) {
            capacity *= 2;
            Object[] arrayCopy = array;
            array = new Object[capacity];
            System.arraycopy(arrayCopy, 0, array, 0, arrayCopy.length);
        }
        size += index == size ? 1 : 0;
        array[index] = element;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        var subArray = subList(index, size);
        var t = c.iterator();
        for (int i = 0; i < c.size(); i++) {      
            this.add(i + index, t.next());
        }

        for (Object o : subArray) {
            this.add(o);
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        var t = c.iterator();

        int lesser = size + c.size();

        for (int i = size; i < lesser; i++) { 
            this.add(t.next());
        }
        return true;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public int indexOf(Object o) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            res = array[i] == o ? i : res;
            if (res != -1) break;
        }
        return res;
    }

    @Override
    public int lastIndexOf(Object o) {
        int res = -1;
        for (int i = size - 1; i >= 0; i--) {
            res = array[i] == o ? i : res;
            if (res != -1) break;
        }
        return res;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        CustomArrayList<T> subArray = new CustomArrayList<>(toIndex - fromIndex);
        subArray.addAll(Arrays.asList(array).subList(fromIndex, toIndex));
        return subArray;
    }

    @Override
    public boolean add(Object e) {
        try {
            add(size, e);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return true;
    }

}