package lab7;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayListIterator<T> implements Iterator {
    private CustomArrayList<T> ar;
    private int currentPos = 0;

    public CustomArrayListIterator(CustomArrayList<T> ar) {
        this.ar = ar;
    }

    @Override
    public boolean hasNext() {
        boolean res = false;
        try {
            
            res = ar.get(currentPos + 1) != null;
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public Object next() {
        return ar.get(currentPos++);
    }
    
}
