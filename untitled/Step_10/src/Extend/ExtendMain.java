package Extend;

public class ExtendMain {
    public static void main(String[] args) {

        Parent p = new Parent();

        p.run();
        p.walk();
        System.out.println();

        Child c = new Child();

        c.eat();
        c.run();
        c.walk();
        System.out.println();

        // 상속 관계에서만 사용이 가능하다
        Parent pc = new Child();
        // 부모 클래스에서 호출 가능한 함수 없을 경우에
        // 자식 클래스에 재정의 된 함수가 있다고 하더라도 호출되지 않는다
        pc.walk(); // 재정의된 Child 클래스 우선
        // pc.eat();

        // Child c1 = (Child) p;

        Child c1 = (Child) pc;
        c1.eat();
        c1.run();

















    }
}
