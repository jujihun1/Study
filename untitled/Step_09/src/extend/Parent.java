package extend;

public class Parent {

    // 핃드
      String str1;
      String str2;
      String str3;

      

      Parent(){
          System.out.println("Parent 생성");

      }

      String getName(){
          return name;
      }

    void renderHong(){
        System.out.println(str1);
    }

    void renderLim(){
        System.out.println(str2);
    }

    void  renderLee(){
        System.out.println(str3);
    }
}
