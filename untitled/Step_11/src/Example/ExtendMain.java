package Example;

public class ExtendMain {
    public static void main(String[] args) {
        
        Object[] objects = new Object[5];   // Object 클래스배열생성
        
        int index = 0;  // 원소 위치변수
           // 부모클래스        자식클래스
        objects[index] = new Teacher();
        objects[index].index = index; 
        objects[index].name = "고길동0";
        objects[index].age = 48;
        objects[index]._class = "K_강의장";
        ++index; // 배열 index 증가
        

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "홍길동1";
        objects[index].age = 32;
        objects[index]._class = "K_강의장";
        ++index;


        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "임꺽정2";
        objects[index].age = 38;
        objects[index]._class = "K_강의장";
        ++index;


        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "이몽룡3";
        objects[index].age = 35;
        objects[index]._class = "K_강의장";
        ++index;


        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "성춘향4";
        objects[index].age = 28;
        objects[index]._class = "K_강의장";
        ++index;


        for (int i = 0; i < objects.length; i++){
            objects[i].render();
        }


        
        
        
        
        
    }
}
