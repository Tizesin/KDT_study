package com.choongang;
import java.util.*;
import java.util.stream.*;
//## 문제
//      남성 회원 이름의 List와 여성 회원 이름의 List가 있습니다.
//      남성 회원과 여성 회원 중 특정 성씨를 갖고 있는 사람의 명단이 필요합니다.
//      중복된 이름은 제거하고 특정 성씨를 갖고 있는 회원들의 이름을 정렬한 후 List로 리턴해야 합니다.
//
//## 입력
//      인자 1 : male
//          - `String` 타입을 요소로 가지는 List
//      인자 2 : female
//          - `String` 타입을 요소로 가지는 List
//      인자 3 : lastName
//          - `String` 타입의 변수
//
//## 출력
//      - `String` 타입을 요소로 가지는 List를 리턴해야 합니다.
public class M_findPeople {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        // TODO:
        Stream<String> maleStream = male.stream();
        Stream<String> femaleStream = female.stream();

        Stream<String> people = Stream.concat(maleStream,femaleStream);

        return people.distinct()
                .filter(person -> person.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());
    }
}
