import java.util.Scanner;

public class Q1 {
//        **목표:**
//        기본 데이터 타입과 객체 타입의 차이점을 이해하고, 다양한 타입의 변수를 선언하고 초기화하는 방법을 실습한다.
//
//        **과제:**
//        - 다음 타입들을 가진 변수를 선언하고, 각각에 적절한 값을 할당하세요: int,double,char,boolean,String.
//        - 두 개의 int 변수를 선언하고, 이들의 합, 빼기, 곱, 나눗셈의 결과를 출력하는 프로그램을 작성하세요.
//        - 사용자로부터 이름과 나이를 입력받아, 그 정보를 화면에 출력하는 간단한 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                Exception e = new Exception("이름입력 오류");
                System.out.print("이름을 입력하세요 : ");
                String user_name = scan.nextLine();
                if (!check_Ex(user_name))
                    throw e;
                System.out.print("나이를 입력하세요 : ");
                int user_age = scan.nextInt();
                if(user_age == 0)
                    throw e;
                System.out.println("이름 : " + user_name + " | 나이 : " + user_age);
                break;
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
    public static boolean check_Ex(String user_name){
        String Up_user_name = user_name.toUpperCase();
        for(int i = 0;i<user_name.length();i++)
        {
            if((Up_user_name.charAt(i) >= 0x40 && Up_user_name.charAt(i) <= 0x5A) || Up_user_name.charAt(i) == 0x20
                    || (Up_user_name.charAt(i) >= 44032 && Up_user_name.charAt(i) <= 55203))
                continue;
            else
                return false;
        }
        return true;
    }
}
