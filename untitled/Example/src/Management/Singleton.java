package Management;

public class Singleton {
    static private  Singleton instance = null;

    static public  Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    private Singleton() {  };
}
