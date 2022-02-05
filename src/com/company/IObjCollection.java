package com.company;

import java.util.Collection;

public interface IObjCollection
{
    boolean add(Object o);

        boolean add(int x, Object o);
        boolean contain(Object o);
        boolean equals (Collection str);
        boolean delete (Object o);
        Object get(int index);
        boolean clear();
        int size();
        void show();

}
