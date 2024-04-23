package com.choongang;
import java.util.*;
//## 문제
//      `Integer` 타입을 요소로 가지는 List를 입력받아 요소의 총 합을 리턴해야 합니다.
//
//## 입력
//      인자 1 : list
//      - `Integer` 타입을 요소로 가지는 List
//## 출력
//      `int` 타입을 리턴해야 합니다.
//
//## 주의 사항
//      - 비어있는 List의 경우 0을 리턴합니다.
//      - 반복문(for, while)의 사용은 금지됩니다.

public class A_computeSumOfAllElements {
    public int computeSumOfAllElements(List<Integer> list) {
        // TODO:
        int sum =
            list.stream()
                    .mapToInt(number -> number)
                    .sum();
        return sum;
    }
}
