package com.choongang;

import java.util.ArrayList;

public class F_modifyNthElement {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        // TODO:
        if(arrayList.size() < index-1)
            return null;
        arrayList.set(index,str);
        return arrayList;
    }
}
