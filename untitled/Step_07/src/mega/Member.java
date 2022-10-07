package mega;

public class Member {
    private String id;
    private String userName;
    private Integer age;

    // getter > 참조만 가능
    // setter > 변경만 가능

    // initialize();
    // progress();
    // update();
    // delete();


    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUserName() {return userName;}
    public void  setUserName(String userName) {this.userName = userName;}

    public Integer getAge(/*매개 변수*/) {
        return age;
    }
    public void  setAge(Integer age) {this.age = age;}



}
