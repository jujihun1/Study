package mega;

public class MemberMain {

    //private Member m;
    //private Member m2;





    public static void main(String[] args) {

        Member m = new Member(); // 클래스 선언 초기화
        Member m2; // 클래스 선언
        m2 = new Member(); // 클래스 초기화

        if(m == m2){
            System.out.println("m = m2 같다");
        } else {
            System.out.println("m = m2 다르다");
        }


        m.setId("ABC");
        m.setAge(20);
        m.setUserName("홍길동");
        System.out.println(m.getId());
        System.out.println(m.getAge());
        System.out.println(m.getUserName());

        // ===============================================
        // [객체를 배열로 사용]
        // ===============================================

        Member[] mArray = new Member[5];



        mArray[0] = new Member();
        mArray[0].setId("Key1");
        mArray[0].setAge(20);
        mArray[1] = new Member();
        mArray[1].setId("Key2");
        mArray[2] = new Member();
        mArray[2].setId("Key3");
        mArray[3] = new Member();
        mArray[3].setId("Key4");
        mArray[4] = new Member();
        mArray[4].setId("Key5");



        for (Member element : mArray){
            String str = element.getId();
            System.out.println(str);
            }
        System.out.println(mArray[0].getAge());
        System.out.println(mArray.length);


    }
}
