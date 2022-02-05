package com.company;
import java.util.Arrays;
import java.util.Collection;

public class ObjCollectionImpl {
    private Object[] objectArray;
    private int count = 0;


    public ObjCollectionImpl() {
        objectArray = new Object[10];
        count = 0;
    }

    public ObjCollectionImpl(int size) {
        objectArray = new Object[size];
        count = 0;
    }


    public void show() {
        for (Object o : objectArray) {
            System.out.println(o);
        }
    }


    public boolean add(Object o) {
        if (count == objectArray.length) {
            this.objectArray = Arrays.copyOf(this.objectArray, (this.objectArray.length * 3) / 2 + 1);
            add(count, o);
        } else {
            add(count, o);
        }
        return true;
    }


    public boolean add(int index, Object o) {
        if (index > this.count)
            throw new ArrayIndexOutOfBoundsException();
        else {
            this.objectArray = Arrays.copyOf(this.objectArray, this.objectArray.length);
            for (int i = this.objectArray.length - 1; i > index; i--) {
                objectArray[i] = objectArray[i - 1];
            }
            this.objectArray[index] = o;
            count++;

        }
        return true;
    }


    public boolean delete(Object o) {
        for (int i = 0; i < this.objectArray.length - 1; i++) {
            if (objectArray[i] == o) {
                this.objectArray[i] = this.objectArray[i + 1];
            }
        }
        this.objectArray = Arrays.copyOf(this.objectArray, this.objectArray.length);
        objectArray[--count] = null;
        return true;
    }


    public Object get(int index) {
        if (index > this.count)
            throw new ArrayIndexOutOfBoundsException();
        return this.objectArray[index];
    }


    public boolean contain(Object o) {
        for (Object object : this.objectArray) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }


    public boolean equals(Collection str) {
        IObjCollection oc = (IObjCollection) str;
        if (!(str instanceof IObjCollection)) return false;
        if (this == str) return true;
        if(this.size() != oc.size())return false;

        return false;
    }


    public boolean clear() {
        this.objectArray = new Person[10];
        count = 0;

        return true;
    }

    public int size() {
        return this.count;
    }



}
