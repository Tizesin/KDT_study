import java.util.Scanner;

public class Q3 {
//        **목표:**
//        조건문과 반복문을 사용하여 복잡한 로직과 반복되는 작업을 처리할 수 있다.
//
//        **과제:**
//        - 사용자로부터 숫자를 하나 입력받아, 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
//        - 1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요.
//        - 사용자로부터 숫자 n을 입력받아, 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.

    public static void main(String[] args) {
        int num1,num2;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        if(num1 == 0)
            System.out.println("0입니다.");
        else
            System.out.printf("%s\n",num1<0?"음수입니다.":"양수입니다.");

        for(int i = 2; i <= 100; i+=2)
            System.out.println(i);

        num2 = scan.nextInt();
        int i = num2, sum = 0;
        while(i>0){
            sum += i;
            i--;
        }
        System.out.println(sum);
    }
}
