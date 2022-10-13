package extend;

public class Child extends  Parent{ // 상속

    int age;

    Child(){
        System.out.println("Child 생성");
    }

    int getAge(){
        return age;
    }

    void render(){ // Parent 의 render 함수명, 매개변수가 같음 오버라이드
        //  멤버 변수와 똑같은 이름의 지역변수를 선언
        int age = 100;
        // super 키워드를 사용하여 부모클래스에 있는 변수에 접근가능
        // age 앞에 this. 를 붙혀주지 않는다면 지역변수를 사용하게 된다
        System.out.println(super.name + " : " + this.age);

    }

    void render(int num){ // 같은 클래스(Child extend Parent)내에서 같은 함수이름(render)을 가짐
                          // 단, 파라미터 값이 다름(인자 값, 개수가 다름) (오버로딩)
                          // 상속간의 이뤄질수 있는 함수의 재정의 (오버라이딩)
        //  멤버 변수와 똑같은 이름의 지역변수를 선언
        int age = 100;
        // super 키워드를 사용하여 부모클래스에 있는 변수에 접근가능
        // age 앞에 this. 를 붙혀주지 않는다면 지역변수를 사용하게 된다
        System.out.println("입력한 " + num + "이고 정수 입니다.");

    }

    void  render(String str){
        System.out.println("입력한 " + str + "이고 문자열 입니다.");
    }



    

}
