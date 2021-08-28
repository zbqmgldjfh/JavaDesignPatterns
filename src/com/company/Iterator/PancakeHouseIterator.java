package com.company.Iterator;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseIterator(ArrayList items){
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem)items.get(position++);
        return menuItem;
    }

    public boolean hasNext() {
        if(position >= items.size() || items.get(position) == null){
            return false;
        }else {
            return true;
        }
    }
}
