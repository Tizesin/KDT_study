package com.choongang;

import java.util.ArrayList;

public class E_addNth {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        // TODO:
        if(arrayList.size() < index-1)
            return null;
        arrayList.add(index,element);
        return arrayList;
    }
}
