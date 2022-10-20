package Management;

public class Page {

    public void SetData(){
        Member member = new Member();
        Group group = new Group("K_강의장","Java");
        member.setAge(32);
        member.setUserName("홍길동");
        group.set_class("K_강의장");
        group.setSubject("java");

        member.setGroup(group);

        Singleton.getInstance().setMember(member);



    }

}
