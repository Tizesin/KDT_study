package com.choongang;

import java.util.*;

public class U_getElementOfListEntry {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        // TODO:
        List<String> list = new ArrayList<>();
        if(hashMap.get(key)==null)
            return null;
        if(hashMap.size() < index-1)
            return null;
        list = hashMap.get(key);
        return list.get(index);
    }
}
