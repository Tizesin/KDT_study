public class Q6 {
//        **목표:**
//        문자열 처리 관련 메서드를 구현하고, 메서드 오버로딩을 통해 같은 기능을 다양한 매개변수로 제공할 수 있는 능력을 실습한다.
//
//        **과제 설명:**
//        1. **기본 문자열 처리 메서드 작성**
//        - StringUtil 클래스를 생성하세요. 이 클래스는 문자열 처리와 관련된 다양한 기능을 제공하는 유틸리티 메서드를 포함할 것입니다.
//        - 다음 기능을 수행하는 메서드를 StringUtil 클래스 내에 작성하세요:
//        - reverse: 하나의 String을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다.
//        - concat: 두 개의 String을 매개변수로 받아 이를 연결한 결과를 반환합니다.
//        - contains: 하나의 String과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.
//        2. **메서드 오버로딩 실습**
//        - concat 메서드를 오버로딩하여, 세 개의 String을 매개변수로 받아 이를 모두 연결한 결과를 반환하는 버전을 추가하세요.
//        - contains 메서드를 오버로딩하여, 두 개의 String을 매개변수로 받아 첫 번째 문자열이 두 번째 문자열을 포함하는지 여부를 반환하는 버전을 추가하세요.

    public static void main(String[] args) {
        //test code
        StringUtil test_code = new StringUtil();
        String test1 = "hello_world";
        String test2 = "Java";
        String test3 = "world";
        char c = 'h'; //

        //reverse
        System.out.println(test_code.reverse(test1));

        //concat
        System.out.println(test_code.concat(test1,test2));

        //concat overloading method
        System.out.println(test_code.concat(test1,test2,test3));

        //contains
        if(test_code.contains(test1,c))
            System.out.println("포함 되어있음.");
        else
            System.out.println("비포함.");

        //contains overloading method
        if(test_code.contains(test1,test3))
            System.out.println("포함 되어있음.");
        else
            System.out.println("비포함.");

    }
}
class StringUtil{

    String reverse(String str) {
        StringBuffer rev = new StringBuffer(str);
        return rev.reverse().toString();
    }

    String concat(String str1, String str2) {
        return str1+str2;
    }
    String concat(String str1, String str2, String str3) { return str1+str2+str3; }
    boolean contains(String str, char c) {
        for(int i = 0; i < str.length(); i++){
            if(c == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    boolean contains(String str1, String str2) {
        return (str1.indexOf(str2) >= 0)?true:false;
    }
}
