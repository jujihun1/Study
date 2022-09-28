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



            // =================================================
            // 1. char = 정수형 이다.
            // 2. 각각의 데이터 타입의 형태로 출력됨.
            // * int 형 타입에 문자로 초기화를 진행 하더라도
            //  출력할 때에는 정수를 출력하고, char 타입에
            //  정수로 초기화를 하더라도 출력할 때에는 문자가 출력됨.
            // =================================================
            char c1 = 'A';
            int i1 = c1;
            char c2 = 66;
            int i2 = c1 + i1;

            System.out.println(c1);
            System.out.println(i1);
            System.out.println(c2);
            System.out.println(i2);

            // =================================================
            // 1. float = 실수 값의 마지막에 f 붙혀준다.
            // 2. double = 실수 값의 마지막에 d 붙혀준다.
            // * double = 실수 값의 마지막에 d가 없더라도 double 타입으로 판단.
            // =================================================

            float f = 3.141592653589793f;

            double d = 3.141592653589793d;
            double d2 = 3.141592653589793;

            System.out.println(f);
            System.out.println(d);
            System.out.println(d2);


            // =================================================
            //   [상수와 리터럴]
            // ** final = 상수 선언에 사용되는 키워드
            // * 선언시에 최초 한번만 초기화 가능.
            // =================================================

            int i = 10;

            final double PI = 3.141592;

            // ** 상수로 선언 해놓고 값을 다시 변경하려고 할 때 ....
            // PI = 3.141592653689793; Err



            // =================================================
            // [\n] = 줄바꿈
            // [\t] = 탭
            // [\\] = \
            // [\`] = `
            // [\"] = "
            // =================================================

            System.out.println("문자열\n출력");
            System.out.println("문자열\t출력");
            System.out.println("문자열\\출력");
            System.out.println("\"문자열\" \"출력\"");

            // =================================================
            //    [변수의 범위]
            // 1. 특정 영역에서 생성된 변수는 해당 역역을 빠저나가면
            //  더이상 사용할 수 없다.
            //
            // 2. 영역이 다르다면 변수명을 동일하게 지을수 있음.
            //
            // 3. A라는 영역 내부에서 또 다른 B라는 영역을 포함 한다면,
            //  B영역은 A영역의 일부이다.
            // =================================================

            int Number1 = 10;

            {
                int Number2 = 1000;

                Number1 = 100;
            }

            {
                int Number2 = 10000;
                Number1 = 1000;
            }

            System.out.println("Number1 : " + Number1);
            // System.out.println("Number2 : " + Number2);  Err
                



    }
}