package com.choongang;

import java.lang.reflect.Array;
import java.util.*;

public class R_addEvenValues {
    public int addEvenValues(HashMap<Character, Integer> hashMap) {
        // TODO:
        Set<Character> set = hashMap.keySet();
        Iterator<Character> iterator = set.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            Character key = iterator.next();
            Integer values = hashMap.get(key);
            if(values % 2 == 0)
                sum += values;
        }
        return sum;
    }
}
