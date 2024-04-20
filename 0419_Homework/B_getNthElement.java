package com.choongang;
import java.util.*;

public class B_getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        // TODO:
        if(arrayList.size()-1 < index || arrayList.isEmpty())
            return null;
        else
            return arrayList.get(index);
    }
}
