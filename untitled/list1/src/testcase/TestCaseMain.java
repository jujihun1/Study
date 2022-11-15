package testcase;

public class TestCaseMain {
    public static void main(String[] args) {

//        ObjectA a = new ObjectA("A","홍길동","B","임꺽정",25);


        // ** objectA 생성
        ObjectA a = new ObjectA();

        // 필드값 초기화
        a.setId("A");
        a.setName("홍길동");

        // ** objectB 생성
        ObjectB b = new ObjectB();

        b.setId("B");
        b.setName("임꺽정");
        b.setAge(25);

        // ** A 오브젝트에 B를 연결시킨다
        a.setObjectB(b);

        System.out.println(a.getObjectB().getId());



    }
}
