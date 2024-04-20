package com.choongang;

import java.util.HashMap;

public class W_select {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        // TODO:
        HashMap<String, Integer> newHashMap = new HashMap<String, Integer>();
        for(String str : arr){
            Integer newHashMap_val = hashMap.get(str);
            if(newHashMap_val!=null){
                newHashMap.put(str,newHashMap_val);
            }
        }
        return newHashMap;
    }
}
