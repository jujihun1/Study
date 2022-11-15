package testcase;

public class ObjectA {

    private String name;

    public String id;
    private ObjectB objectB;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectB getObjectB() {
        return objectB;
    }

    public void setObjectB(ObjectB objectB) {
        this.objectB = objectB;
    }

    public ObjectA() { }
    
    public ObjectA(String idA,String nameA,String idB,String nameB,int age){ //  *** 생성자는 new 메모리할당 꼭
        this.id = idA;
        this.name = nameA;
        this.objectB = new ObjectB(idB,nameB, age);
    }

}
