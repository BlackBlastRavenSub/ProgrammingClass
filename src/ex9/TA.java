package ex9;

public class TA extends Student {
    private String subject;
    private String extension;

    public TA(String studentNumber, String name, String address, String tel, String subject, String extension) {

        super(studentNumber, name, address, tel);
        this.subject = subject;
        this.extension = extension;
    }

    public static void main(String[] args) {
        TA ta = new TA("17FI084", "野田翔太郎", "ABC", "999","SUBJECT","ExTel");
        System.out.println(ta.toString());
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "a TA(" +
                "studentNumber='" + super.getStudentNumber() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", tel='" + super.getTel() + '\'' +
                "subject='" + subject + '\'' +
                ", extension='" + extension + '\'' +
                ')';
    }
}
