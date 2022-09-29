public class Main {
    public static void main(String[] args) {
        // ===========================================
        // [제어문]
        // ===========================================

        // 조건문(분기문)
        // [if], [else], [else if], [switch/case]

        {
            int number = 10;

            // 만약 number 값이 100이 넘는다면 ?
            // 또는 0 보다 작다면 ?
            if(number > 100 || 0 > number) {   // number > 100 or 0 > number
                System.out.println(number + "의 값이 잘못 되었습니다"); // 실행문
            } else {
                System.out.println("정상 입력 되었습니다");
            }

            // ** if 영역과 else 영역을 서로 다른 분기로 나누어
            // 특정 조건에 맞는 영역만을 실행하게 된다

            // ** 해당 분기문은 두 역역중 무조건 1개의 영역은 실행됨

            //===============================================

            // ** if 문만 있는경우는 조건에 맞으면 실행 되지만
            // ** 조건과 성립하지 않는 경우에는 pass
            if(number == 10){
                System.out.println("당첨");
            }
            // ** if/else 문은 if 문만 별도로 사용가능하고,
            // ** else 문은 따로 사용할수없다
            // ** else 문이 사용되기 위해서는 if 문이 선행 되어야 함
            // ** else 문이 사용되었다면 분기들 중 하나의 분기는 무조건 실행 된다

            // =====================================================
            // ** 여러개의 분기를 만들어서 사용 가능
            if(false){ // if 문은 true 일 경우에만 실행
                System.out.println("true");
            } else if(false){
                System.out.println("false");
            } else{     // else 문은 false 일 경우에 실행
                System.out.println("false");// else 는 조건문이 필요하지 않음
            }

            //======================================================

            // ** 분기문의 중첩사용이 가능하다
            if(true) {
                if(false) {

                } else {

                }
            } else {

            }



        }




    }
}