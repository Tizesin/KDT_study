package kiosk_homework;

import java.util.Scanner;

public class Kiosk {
    private final MenuItem menuItem1 = new MenuItem("김밥", 1000);
    private final static MenuItem menuItem2 = new MenuItem("계란 김밥", 1500);
    private final static MenuItem menuItem3 = new MenuItem("충무 김밥", 1000);
    private final static MenuItem menuItem4 = new MenuItem("떡볶이", 2000);

    static int limitMaxOrder = 99;
    // 주문 안내 메시지를 출력하는 메서드를 정의할 수 있습니다.
    // 주문할 음식을 선택하는 메서드를 정의 할 수 있습니다.
    // 주문할 음식의 수량을 입력하는 메서드를 정의할 수 있습니다.
    // 음식 주문을 위한 메서드를 정의할 수 있습니다.
    // 주문 결과를 출력하는 메서드를 정의할 수 있습니다.
    int showList(){
        int menuPrice, menuNum;
        System.out.println("[안내] 원하시는 메뉴의 번호를 입력하여 주세요.");
        for(int i = 1; i < 5; i++){
            switch(i) {
                case 1:
                    System.out.print(i + ")" + menuItem1.getName() + "(" + menuItem1.getPrice() + "원) ");
                    break;
                case 2:
                    System.out.print(i + ")" + menuItem2.getName() + "(" + menuItem2.getPrice() + "원) ");
                    break;
                case 3:
                    System.out.print(i + ")" + menuItem3.getName() + "(" + menuItem3.getPrice() + "원) ");
                    break;
                default: // case 4:
                    System.out.println(i + ")" + menuItem4.getName() + "(" + menuItem4.getPrice() + "원) ");
                    break;
            }
        }

        Scanner sc = new Scanner(System.in);
        menuNum = sc.nextInt();
        menuPrice = selectMenu(menuNum);
        if(menuPrice==-1)
            return showList();
        else
            return menuPrice;
    };

    int selectMenu(int menuNum){
        if(menuNum < 1 || menuNum > 4){
            System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.\n");
            return -1;
        }
        switch(menuNum) {
            case 1:
                return menuItem1.getPrice();
            case 2:
                return menuItem2.getPrice();
            case 3:
                return menuItem3.getPrice();
            default: // case 4:
                return menuItem4.getPrice();
        }
    };

    void selectAmount(int price){
        int num;
        System.out.println("-".repeat(40));
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.printf("(※ 최대 주문 가능 수량 : %d)\n",limitMaxOrder);
        Scanner sc1 = new Scanner(System.in);
        num = sc1.nextInt();
        if(num > limitMaxOrder) {
            System.out.println("[경고]" + num + "개는 입력하실 수 없습니다.");
            System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
            selectAmount(price);
            return;
        }
        System.out.println("[안내]" + num + "개를 입력하셨습니다.");
        System.out.println("[안내]주문하신 메뉴의 총 금액은" + num*price + "원 입니다.");
    }
}

