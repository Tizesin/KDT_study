package com.choongang;
import java.util.*;
import java.util.stream.Stream;
//## 문제
//      `Integer` 타입을 요소로 가지는 List를 입력받아 요소의 평균을 리턴해야합니다.
//
//## 입력
//      인자 1 : list
//      - `Integer` 타입을 요소로 가지는 List
//
//## 출력
//      - `double` 타입을 리턴해야 합니다.
//
//## 주의 사항
//      - 비어있는 List의 경우 `0`을 리턴해야 합니다.
//      - 반복문(`for`, `while`) 사용은 금지됩니다.
public class B_computeAverageOfNumbers {
    public double computeAverageOfNumbers(List<Integer> list) {
        // TODO:
        if(list.isEmpty())
            return 0;
        Double result =
                list.stream()
                        .mapToDouble(number -> number)
                        .average()
                        .getAsDouble();
        return result;

//        다른 답안 1
//        OptionalDouble number = list.stream()
//                .mapToDouble(m->m)
//                .average();
//        if(number.isPresent()){
//            return number.getAsDouble();
//        }else{
//            return 0.0
//        }

//        다른 답안 2
//        return list.stream()
//                .mapToDouble(m->m)
//                .average()
//                .orElse(0.0);
    }
}
