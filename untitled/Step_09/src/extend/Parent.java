package extend;

public class Parent {

    // 핃드
      String str1;
      String str2;
      String str3;

      String name;

      Parent(){
          System.out.println("Parent 생성");

      }

      String getName(){
          return name;
      }

    void render(){
        System.out.println(name);
    }

    void  render(String str){
        System.out.println("입력한 " + str + "이고," + name +  "입니다.");
    }

    void  render(String str, int num){
        System.out.println("입력한값은 " + str + " 이고 " +  num + " 문자열 입니다.");
    }
}
