package com.choongang;

import java.util.ArrayList;

public class G_removeFromFront {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        // TODO:
        if(arrayList.isEmpty())
            return null;
        return arrayList.remove(0);
    }
}
