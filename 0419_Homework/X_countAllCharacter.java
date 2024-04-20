package com.choongang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class X_countAllCharacter {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        // TODO:
        Set<Character> word = new HashSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if(str.length() == 0)
            return null;
        for(int i = 0; i < str.length(); i++){
            Integer hashMap_val = hashMap.get(str.charAt(i));
            if(hashMap_val==null){
                hashMap.put(str.charAt(i),1);
            }else{
                hashMap.put(str.charAt(i),hashMap_val+1);
            }
        }
        return hashMap;
    }
}
