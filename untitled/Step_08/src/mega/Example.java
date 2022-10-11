package mega;

import mega.example.test.MegaExample;

//private
//public
//defult
//protected
public class Example {

//    private getinstance(){
//
//    }


    MegaExample megaExample;

    int age;
    String name;

    Example(){ // 기본생성자1
        // ** 클래스가 생성됨과(생성직후) 동시에 호출된다
        age = 0;
    }




    Example(String name, int age){ // 복사생성자
        // ** 클래스가 생성됨과(생성직후) 동시에 호출된다
        this.age = age;
        this.name =name;
        // ** 사용자가 호출한 시점에 호출된다
    }

    void output(){
        System.out.println(name + ": " + age);
    }


    public static void main(String[] args) {




    }
}
