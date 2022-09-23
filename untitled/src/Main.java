import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 주석 ** : 컴퓨터가 인식하지 못하는 영역


        /*
        * 주석 : 여러줄의 영역을 인식하지 못하게 해야할 경우에 사용
        */
        // ** 변수 : 값이 언제든지 변경 가능한 수.
        // ** 상수 : 값의 변경이 불가능한 수

        // ** lvalue  rvalue
        // ** 함수
        // ** 변수 선언 및 초기화
        int number = 10;
        int num = 100;
        
        // ** 출력 
        System.out.println(number);
        System.out.println(num);
        
        // ** 값 변경
        number = 20;
        num = 200;
        
        // ** 출력
        System.out.println(number);
        System.out.println(num);

        int a = 'A';
        System.out.println(a);

        // ======================================================
        // [자료형]
        // ======================================================

        /*
        * 정수형 datatype
        * char : 문자를 표현할때 사용. 2byte
        *
        * byte : 1 byte
        * short : 2 byte
        * int : 4 byte
        * long : 8 byte
        *
        * 실수형 datatype
        * float : 4 byte
        * double : 8 byte
        *
        * 논리형 datatype
        * boolean : 1 byte
         */
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A + B) % C); // 5 + 8 / 4 > 나머지값 1
        System.out.println((A % C) + (B % C) % C);  // 5 / 4 + 8 / 4 /4
        System.out.println((A * B) % C);
        System.out.println((A % C) * (B % C) % C);






    }
}