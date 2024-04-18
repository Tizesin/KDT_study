package kiosk_homework;

import java.util.Scanner;

import static kiosk_homework.Kiosk.limitMaxOrder;

public class KioskApplication {
    public static void main(String[] args) {
        // Kiosk 클래스의 기능을 구현 및 활용해서 프로그래밍 요구 사항에 맞는 키오스크 프로그램을 구현하세요.
        // MenuItem 클래스는 음식 정보를 표현하고 있으며 MenuItem 클래스를 이용해 주문할 음식 정보를 출력할 수 있습니다.
        // 이 외의 필요한 클래스가 있다면 자유롭게 추가해서 여러분들만의 키오스크 프로그램을 만들면 됩니다.
        int menuPrice;
        System.out.println("[안내] 안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(40));
        Kiosk kiosk = new Kiosk();
        menuPrice = kiosk.showList();
        kiosk.selectAmount(menuPrice);
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}