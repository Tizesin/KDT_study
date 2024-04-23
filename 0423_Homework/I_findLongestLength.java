package com.choongang;
import java.util.*;
//## 입력
//      인자 1 : strArr
//      - `String` 타입을 요소로 가지는 배열
//
//## 출력
//      - `int` 타입을 리턴해야 합니다.
//
//## 주의 사항
//      - 반복문(`for`, `while`) 사용은 금지됩니다.
//      - 빈 배열을 입력받은 경우 `0`을 리턴해야 합니다.
public class I_findLongestLength {
    public int findLongestLength(String[] strArr) {
        // TODO:
        return Arrays.stream(strArr)
                .mapToInt(String::length)
//                .mapToInt(str -> str.length())
                .max()
                .orElse(0);
    }
}
