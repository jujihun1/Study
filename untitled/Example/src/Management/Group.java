package Management;

public class Group {
    String _class;
    String subject;

    public Group() {};
    public Group(String _class, String subject) {
        this._class = _class;
        this.subject = subject;
    };



    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
//
//public class Group {
//    String _class;
//    String subject;
//
//    public Group() {};
//    public Group(String _class, String subject) {
//        this._class = _class;
//        this.subject = subject;
//    };
//
//    public String getSubject() { return subject; }
//    public void setSubject(String subject) { this.subject = subject; }
//
//    public String get_class() { return _class; }
//    public void set_class(String _class) { this._class = _class; }
