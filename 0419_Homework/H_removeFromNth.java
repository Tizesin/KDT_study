package com.choongang;

import java.util.ArrayList;

public class H_removeFromNth {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        // TODO:
        if(arrayList.size() < index-1)
            return null;
        return arrayList.remove(index);
    }
}
