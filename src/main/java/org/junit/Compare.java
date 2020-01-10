package org.junit;

public class Compare<T> implements java.util.Comparator<T>{

    public int compare(T o1, T o2) {
        if(o1.equals(o2))
            return 0;
        else
            return -1;
    }

    public int compareInt(int i1, int i2)
    {
        if(i1==i2)
            return 0;
        if(i1>i2)
            return 1;
        else 
            return 0;
    }
}
