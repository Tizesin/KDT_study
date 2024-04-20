package com.choongang;

import java.util.ArrayList;
import java.util.Iterator;

public class L_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        // TODO:
        if(arrayList.isEmpty())
            return 0;
        Iterator<Integer> iterator = arrayList.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            Integer num = iterator.next();
            sum += num;
            iterator.remove();
        }
        return sum;
    }
}
