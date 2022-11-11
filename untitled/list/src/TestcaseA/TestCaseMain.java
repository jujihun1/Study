package TestcaseA;

public class TestCaseMain {

    public static void main(String[] args) {

        ObjectA objA = new ObjectA();
        ObjectB objB = new ObjectB();


        System.out.println(objA.getNodeB().getNodeA().getName());
        System.out.println(objA.getName());

        System.out.println(objB.getNodeA().getName());
        System.out.println(objB.getName());


    }
}
