package Management;

public class ManagementMain {
    public static void main(String[] args) {
        Page page = new Page();
        page.SetData();




        Member member = Singleton.getInstance().getMember();

        String name = member.getUserName();
        int age = member.getAge();

        String _class = member.getGroup().get_class();
        String subject = member.getGroup().getSubject();

        System.out.println(name + " : " + age + " " +  _class + " " + subject );

//        member.setAge(36);
//        member.setUserName("임꺽정");
//        group.set_class("K_강의장");
//        group.setSubject("java");
//
//        String name1 = member.getUserName();
//        int age1 = member.getAge();
//        String _class1 = group.get_class();
//        String subject1 = group.getSubject();
//
//        System.out.println(name1 + " : " + age1 + " " +  _class1 + " " + subject1 );
//
//        member.setAge(28);
//        member.setUserName("이몽룡");
//        group.set_class("K_강의장");
//        group.setSubject("java");
//
//        String name2 = member.getUserName();
//        int age2 = member.getAge();
//        String _class2 = group.get_class();
//        String subject2 = group.getSubject();
//
//        System.out.println(name2 + " : " + age2 + " " +  _class2 + " " + subject2 );






    }



}
