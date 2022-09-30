import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int score = 88;
        String grade = "";
        if(score >= 90){
            grade = "A";
        } else {
            grade = "x";
        }

        System.out.println(grade);


            */


        int A = sc.nextInt();


        switch (A/10) {
            case 9:
                System.out.println("A");
                break; // 탈출문
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }



    }
}
