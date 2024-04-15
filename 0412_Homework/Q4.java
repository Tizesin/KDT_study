import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
//        **목표:**
//        배열을 선언하고 초기화하는 방법을 이해하고, 배열을 통해 데이터를 관리하는 방법을 학습한다.
//
//        **과제:**
//        - 10개의 정수 값을 저장할 수 있는 배열을 생성하고, 1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
//        - 사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음, 평균 점수를 계산하여 출력하세요.
//        - 주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        int[] Array_1 = new int[10];
        int[] Array_2 = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 10; i++) Array_1[i] = i+1;
        for(int a : Array_1) System.out.println(a);
        for(int i = 0; i < 5; i++){
            int score = scan.nextInt();
            Array_2[i] = score;
        }
        System.out.println("평균 값 : " + Arrays.stream(Array_2).average().orElse(0));
        System.out.println("최대 값 : " + Arrays.stream(Array_2).max().orElse(0));
        System.out.println("최소 값 : " + Arrays.stream(Array_2).min().orElse(0));
    }
}
