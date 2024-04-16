package com.java.seb.lol_program;

public class LOL_Program {
  public static void main(String[] args) {
    //TODO:

    //사용자의 String 정보 / int 정보 / LoL_char 인스턴스화
    String my_info[] = new String[4];
    int my_info_int[] = new int[3];
    LoL_char my_info_class = new LoL_char();

    //적의 String 정보 / int 정보 / LoL_char 인스턴스화
    String enemy_info[] = new String[4];
    int enemy_info_int[] = new int[3];
    LoL_char enemy_info_class = new LoL_char();

    System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
    System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");

    //사용자 정보 String형 + int형으로 반환 받기
    my_info = my_info_class.user_create();
    my_info_int = my_info_class.user_info_int(my_info);

    System.out.println("[안내] 상대의 유닛 정보를 입력해 주세요.");

    //적 정보 String형 + int형으로 반환 받기
    enemy_info = enemy_info_class.user_create();
    enemy_info_int = enemy_info_class.user_info_int(enemy_info);

    System.out.println("------------------------------------");

    //사용자 -> 적 공격
    my_info_class.attack(my_info_int,enemy_info_int);
  }
}
