package com.choongang;

import java.util.ArrayList;

public class C_getLastElement {
    public String getLastElement(ArrayList<String> arrayList) {
        // TODO:
        if(arrayList.isEmpty())
            return null;
        else
            return arrayList.get(arrayList.size()-1);
    }
}
