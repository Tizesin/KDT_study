package com.choongang;
import java.util.*;
import java.util.stream.*;
//## 문제
//      `Integer` 타입을 요소로 가지는 List를 입력받이 짝수 요소만 추출한 List를 리턴해야 합니다.
//
//## 입력
//      인자 1 : list
//      - `Integer` 타입을 요소로 가지는 List
//
//## 출력
//      - `Integer`타입을 요소로 가지는 List를 리턴해야 합니다.
//
//## 주의 사항
//      - 반복문(`for`, `while`) 사용은 금지됩니다.
public class C_filterOddNumbers {
    public List<Integer> filterOddNumbers(List<Integer> list) {
        // TODO:
        List<Integer> result =
                list.stream()
                        .filter(number->number%2==0)
                        .collect(Collectors.toList());
        //비어있는 stream을 list화 시키면 비어있는 list가 된다.
        return result;
    }
}
