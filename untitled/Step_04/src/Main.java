public class Main {
    public static void main(String[] args) {
        // ==========================================================
        //  [배열]
        // ==========================================================

//        int[] numArr;
//        int arrNum[];

        // ** null 아무것도 없는 상태
        // ** " " Space 한칸이 있는 상태

        // ** 출력의 상태는 동일하지만 전혀 다른 값


        String str1 = " ";
        String str2 = null;


        // ** 배열의 초기화.
        {
            int[] numArr = new int[5];
//        int[] arrNum = null;

            System.out.println(numArr[0]);
            // ** 처기화 되지 않은 배열은 에러
//        System.out.println(arrNum[0]);
            System.out.println(numArr.length);
        }
        {
            // ** 배열 초기화 방법
            int[] number = new int[5];
//            int number[] = new int[5];

            // ** 원소에 값을 초기화
            number[0] = 10;
            number[1] = 20;
            number[2] = 30;
            number[3] = 40;
            number[4] = 50;

            // ** 각각의 원소를 출력한다
            System.out.println(
                    number[0] + " " +
                    number[1] + " " +
                    number[2] + " " +
                    number[3] + " " +
                    number[4] + " ");
        }

        {
            int[] number = new int[5];

            for (int i = 0; i < number.length; i++){
                number[i] = i * 10 + 10;
                System.out.println(number[i]);
            }


        }

        {
            // ** 배열 초기화의 다른 방법
            String[] strArr = {"홍길동", "이순신", "김유신"};
            System.out.println("배열의 길이 = " + strArr.length);

            for (int i = 0; i < strArr.length; i++){

                System.out.println(strArr[i]);
            }

        }

        {
            int[] numbers = new int[6];

            int index = 0;
            while (true) {
                // ** 1 ~ 45 사이의 난수를 생성
                int num = (int)(Math.random() * 45) + 1;

                // ** true || false
                boolean insert = true;

                // ** 리스트에 같은 값이 있는지 확인
                for (int i = 0; i <= index; ++i){
                    // ** 만약 같은 값이 존재 한다면..
                    if(numbers[index] == num) {
                        // ** 데이터를 넣지 못하게 함
                        insert = false;
                        break;
                    }
                }
                // ** 같은 값이 없을때..
                if(insert == true){
                    // ** 리스트에 값을 추가한다
                    numbers[index] = num;
                    // ** 인덱스를 증가 시킨다
                    ++index;
                }
                // ** 리스트가 모두 완성되었다면 반복문을 탈출한다
                if (index == 6){
                    break;

                }
                // ** 로또번호 출력
                for (int i = 0; i < numbers.length; i++){
                    System.out.println(numbers[i]);
                }




            }

        }



    }
}