package testcase;

public class ObjectA {

    private ObjectB objectB;

    public ObjectB getObjectB() {
        return objectB;
    }

    public ObjectA() { // class name == 생성자 name 
        objectB = new ObjectB("홍길동",34);
    }
    
    public ObjectA(String name, int age){ //  *** 생성자는 new 메모리할당 꼭
        objectB = new ObjectB(name, age);
    }

}
