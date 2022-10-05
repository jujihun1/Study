public class Main {
    public static void main(String[] args) {
        // =====================================================
        //   [다차원 배열]
        // =====================================================
        {
            int[][] numbers = new int[3][3];


            numbers[0][0] = 0;
            numbers[0][1] = 1;
            numbers[0][2] = 2;

            numbers[1][0] = 3;
            numbers[1][1] = 4;
            numbers[1][2] = 5;

            numbers[2][0] = 6;
            numbers[2][1] = 7;
            numbers[2][2] = 8;

        }
        {
            int[][] numbers = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

//            for (int i = 0; i < numbers.length; ++i){
//                for (int j = 0; j < numbers.length; ++j){
//                    System.out.println(numbers[i][j]);
//                }
//            }
        }
        {
            int[][][] numbers = {
                    {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                    },
                    {
                            {10, 11, 12},
                            {13, 14, 15},
                            {16, 17, 18}
                    },
                    {
                            {19, 20, 21},
                            {22, 23, 24},
                            {25, 26, 27}
                    }
            };

//            System.out.println(numbers[2][2][1]);
        }

        {
            int[][] numbers = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int[][] numbers1 = {
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0}
            };

//            for (int i = 0; i < numbers.length; ++i){
//                for (int j = 0; j< numbers.length; ++j){
//                    System.out.println(numbers[i][j]);
//                }
//
//            }
//            for (int i = 0; i < numbers1.length; ++i){
//                for (int j = 0; j < numbers1.length; ++j){
//                    System.out.println(numbers1[i][j]);
//                }
//
//            }


        }

        // ========================================================
        // [문자열]
        // ========================================================

        {
            String name1 = "홍길동";
            String name2 = "임꺽정";
            String name3 = "홍길동";

//            System.out.println(name1 == name2);
//            System.out.println(name1 == name3);
        }
        {
            String name2 = new String("홍길동");
            String name1 = new String("홍길동");

            System.out.println(name1 == name2);
        }

        // ===============================================
        // [정렬]
        // ===============================================
    }

        {
            int[] numbers = new int[10]; // 배열의 길이 선언

            int index = 0; // 배열의 원소값을 넣어주는 변수

            while (true){

                boolean Check = true;

                int num =(int)(Math.random() * 100) + 1;

                for (int i = 0; i < numbers.length; ++i)
                    if (numbers[i] == num){
                        Check = false;
                    }

                if (Check == true){
                    numbers[index] = num;
                    index++;
                }


                if (index == 10){
                    break;
                }
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
                // ===================================== 난수 생성 완료


                // =================[ 버블 정렬 ]==================== 정렬 시작

            for (int i = 0; i < numbers.length - 1; ++i){
                for (int j = i + 1; j < numbers.length; ++j){
                    if (numbers[i] < numbers[j]){
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
                System.out.println(" == 정렬된 값을 출력합니다. ==");
                for (int element : numbers){
                    System.out.println(element);
                }

            }

                //  =================[ 선택 정렬 ] ================
                // 버블정렬 선택정렬


                // ======================================= 정렬 끝




            }






    }
}