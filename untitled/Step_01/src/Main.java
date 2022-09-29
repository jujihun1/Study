public class Main {
    public static void main(String[] args) {
        // ==========================================
        // [연산자]
        // ==========================================

        {
            // ** 산술 연산자
            // [+], [-], [*], [/], [%]

            // ** 대입 연산자
            // [=]

            int a = 3 + 4;
            int b = 3 - 4;
            int c = 3 * 4;
            int d = 3 / 4;
            int e = 3 % 4;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);


            // ** 산술 & 대입 연산자의 결합 사용
            // * 산술연산자 결합
            // [+=], [-=], [*=], [/=], [%=]
            // * 비트연산자 결합
            // [&=], [|=], [^=], [<<=], [>>=], [>>>=]


            // ** 증감 연산자 (단항 연산자)
            // 1씩 증가 하거나, 1씩 감소 하는  연산자

            // ** 전위연산
            {
                int i = 0;
                System.out.println("전위연산 : " + (++i));
            }
            // ** 후위연산
            {
                int i = 10;
                System.out.println("후위연산 : " + (i++));
                System.out.println("후위연산 : " + i);

            }

            // ** 비교 연산자
            // [>], [<], [<=], [>=], [==], [!=]

            /*
            * a [<] b : a 가 b 보다 작은가
            * a [>] b : a 가 b 보다 큰가
            * a [<=] b  : a가 b 보다 작거나 같은가
            * a [>=] b  : a가 b 보다 크거나 같은가
            * a [==] b  : a와 b가 같은가
            * a [!=] b  : a와 b가 다른가
            */

            // ** 논리 연산자
            // [%%], [||], [!], [%], [|]


            /* [&&] : 그리고(and)
            * A와 B가 둘다 true 인 경우에만 성립
            * 예) (10 <= 20) && (10 >= 5) = true

            * [||] : 또는 (or)
            *  A 또는 B 가 true 인 경우에도 성립
            * 예) (10 > 20) || (10 < 5) = true

            * [!] : 아니다 (not)
            * (!A) : A가 아니다
            * (!B) : B가 아니다
            * 예) true > false // false > true

             ** 비트연산에 대한 논리적 개념
            * [&] : 그리고
            *   00011101 = 29
            * & 00000111 = 7
            * ----------------
            *   00000101 = 5
            *
            * [|] : 또는
            *   00011101 = 29
            * | 00000111 = 7
            * ---------------
            *   00011111 = 31
             */

            // ** 비트 연산자
            // [~] = 반전 연산자
            // (NOT 연산자)
            {
                int number = -10;
                System.out.println(~number);
            }
            // [^] = 비트가 서로 다른상태 일때 true
            // (XOR 연산자)
            {
                int number1 = 1;    //  00000001
                int number2 = 3;  //  ^ 00000010
                                    //  00000011
                System.out.println(number1 ^ number2);
            // 변수 생성x (^)XOR 연산자로 스왑
                number1 = number1 ^ number2;
                number2 = number2 ^ number1;
                number1 = number1 ^ number2;

                System.out.println("number1 : " + number1);
                System.out.println("number2 : " + number2);

            }

            //[<<], [>>], [>>>]
            {
                // 2 - 1 = 1
                // 2 + (-1) = 1

                // 5 - 10 = -10
                // 5 + (-10) = -5

                // 만약 어떤 값에 절반에 해당하는 값으로 초기화 해야하는 경우
                // int x = 10/2;

                // 나누기 연산자를 사용하는 것보다 곱하기 연산자를 사용하는 것이 효율적이다
                // int x = 10/0.5f;

                // 곱하기 연산자를 ㅏ용하는 것보다 쉬프트 연산자를 사용하는 것이 효율적이다
                int i = 10>>1;
                System.out.println(i);

                // ** [<<] = *2 와 같음
                // ** [>>] = /2 와 같음

                // [>>>] = 부호 변경 용도
            }

            // ** 삼항 연산자
            {
                //조건식 ? true : false;

                int x = 1000;

                x = 100 < x ? 100 : x;
                System.out.println("x : " + x);
            }
            // ** 문자열 연산자 +

            System.out.println("문자열" + "출력");
        }
    }
}