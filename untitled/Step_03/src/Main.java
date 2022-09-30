public class Main {
    public static void main(String[] args) {
        // =======================================
        // [반복문]
        // =======================================



        {
            // (for)
            // for(초기문; 조건문; 증감문) {
            //  반복될 내용
            //  }

            // ** 1. 각 초기문, 조건문, 증강문은 [;](세미콜론) 으로 구분된다
            // ** 2. 초기문 : int i = 0; 과 같이 사용할 변수를 초기화 하는 내용
            // ** 3. 조건문 : (i < 10) 과 같이 조건이 true 동안 반복됨
            // * 현재 i가 0 이고 10보다 작기 때문에 반복 조건에 맞음
            // ** 4. 증감문 : ++i, i++, --i, i-- 와 같이 증가 하거나 감소하는 내용

            for(int i = 0; i < 10; i++) {
               // System.out.println(i);
            }

            // ** 반복문 중복 사용
            /*
            for(int i = 2; i < 10; i++){
                for (int j = 1; j < 10; j++){
                    System.out.println(i + " * " + j + " = " + i * j);
                }
                System.out.println(" ");
            }


             */

        }

        {
            // ** while
            //
            //   초기문
            // * while (조건식) {
            //      증감문
            //      반복될 내용
            // }


            /*
            int i = 0;
            while (i < 10) {
                //i++;
                System.out.println(i++);
            }

             */
            /*
            // ** 보통 언제 끝이날지 그 끝을 알수없는 경우에 많이 사용됨
            int count = 0;
            int max = 10;
            while (true){
                System.out.println((count++) + " 반복됨. ");
                System.out.println(max);
                System.out.println(count);

                if(count%2 == 0)
                    max++;
                if (count > 10) {
                    break;
                }
            }

             */

            {
                /*
                // [do ~ while] 조건이 성립되지 않더라도 무조건 1회는 실행됨
                int i = 0;
                 do {
                     i++;
                     System.out.println("i = " + i);

                 } while(i < 10);

                 for(i = 0; i < 0; i++){
                     System.out.println("홍길동");
                 }
                 
                 */

            }

        }

        {   // for문 으로 짝수단수만 continue 로 만들기
            for (int i = 2; i <= 9; i++) {
                for (int j = 1; j <= 9; j++){
                    if ( i%2 != 0) continue;
                    System.out.println(i + " * " + j + " = " + i * j);
                }
                System.out.println("\n");

            }
            // for문 으로 홀수단수만 continue 로 만들기

            for(int i = 2; i < 10; i++){
                for(int j = 1; j < 10; j++){
                    if(i % 2 == 0) continue;
                    System.out.println(i + " * " + j + " = " + i * j);
                }
                System.out.println("\n");
            }


        }


    }
}