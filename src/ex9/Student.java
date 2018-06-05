package ex9;

public class Student {
    private String studentNumber;
    private String name;
    private String address;
    private String tel;

    public Student(String studentNumber, String name, String address, String tel) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public static void main(String[] args) {
        Student student=new Student("17FI084","野田翔太郎","ABC","999");
        System.out.println(student.toString());
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "a Student(" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ')';
    }

}
/*
public void Student(){}
    public void getStudentNumber(){}
    public void getName(){}
    public void setName(){}
    public void getAddress(){}
    public void setAddress(){}
    public void getTel(){}
    public void setTel(){}
    public String toString(){
        return null;
    }
 */