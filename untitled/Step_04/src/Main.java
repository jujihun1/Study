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



    }
}