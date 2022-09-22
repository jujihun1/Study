import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 주석 ** : 컴퓨터가 인식하지 못하는 영역


        /*
        * 주석 : 여러줄의 영역을 인식하지 못하게 해야할 경우에 사용
        */
        System.out.println("Hello world!");
        System.out.println("주지훈");
        System.out.println("주지훈");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 더할 값
        int sum = 0;
        for(int i = 1; i < a; i++){
            sum += i; // 입력한 a의 값만큼 i가 for문으로 돌면서  sum에 더해짐
            System.out.println(sum);
        }



    }
}