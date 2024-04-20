package com.choongang;

import java.util.HashMap;

public class S_addFullNameEntry {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        // TODO:
        String fullName;
        fullName = hashMap.get("firstName") + hashMap.get("lastName");
        hashMap.put("fullName",fullName);
        return hashMap;
    }
}
