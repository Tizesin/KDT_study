import java.util.Scanner;


public class Q2 {
//        **목표:**
//        다양한 연산자(산술, 비교, 논리 연산자 등)의 사용 방법을 이해하고, 이를 활용하여 간단한 계산이나 조건 검사를 할 수 있다.
//
//        **과제:**
//        - 사용자로부터 두 개의 숫자를 입력받아, 이들에 대한 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//        - 두 개의 숫자는 모두 double타입의 값입니다. 결과값도 double타입을 반환해야 합니다.
//        - 나눗셈에서 0으로 나눌 경우 나눌 수 없는 수라는 예외 메시지를 출력해야 합니다.
//        - 세 개의 다른 정수 값들을 비교하여 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요.
//        - 세 개의 다른 정수는 모두 콘솔 입력을 통해 할당합니다.
//        - &&, ||, ! 연산자를 사용하여 논리 연산을 수행하는 예제를 작성하세요.
    public static void main(String[] args) {
        double num_1, num_2;
        int num_3, num_4, num_5, max = 0, min = 0;
        String devide_1, devide_2;

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력해 주세요.");
        num_1 = scan.nextDouble();
        num_2 = scan.nextDouble();
        if(num_2 == 0) {
            devide_1 = "계산 불가";
            devide_2 = "계산 불가";
        }
        else {
            devide_1 = String.format("%.3f", (num_1 / num_2));
            devide_2 = String.format("%.3f", (num_1 % num_2));
        }

        System.out.printf("1번문제 결과 값 : " +
                            "\n덧셈 = %.3f " +
                            "\n뺄셈 = %.3f " +
                            "\n곱셈 = %.3f " +
                            "\n나눗셈 = %s " +
                            "\n나머지 = %s \n",
                            (num_1 + num_2), (num_1 - num_2),(num_1 * num_2),devide_1, devide_2);

        System.out.println("숫자 세 개를 입력해 주세요.");
        num_3 = scan.nextInt();
        num_4 = scan.nextInt();
        num_5 = scan.nextInt();
        if(num_3 >= num_4 && num_3 >= num_5) {
            max = num_3;
            min = num_4>num_5?num_5:num_4;
        }
        else if(num_4 >= num_3 && num_4 >= num_5) {
            max = num_4;
            min = num_3>num_5?num_5:num_3;
        }
        else if(num_5 >= num_4 && num_5 >= num_3) {
            max = num_5;
            min = num_4>num_3?num_3:num_4;
        }
        System.out.printf("최댓값 : " + max + "| 최솟값 : " + min);
    }
}
