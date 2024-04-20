package com.choongang;

import java.util.ArrayList;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        // TODO:
        if(arrayList.isEmpty())
            return null;
        arrayList.remove(arrayList.size()-1);
        ArrayList<Integer> new_arrayList = new ArrayList<>();
        for(Integer num : arrayList)
            new_arrayList.add(num);
        return new_arrayList;
    }
}
