package ex13;

public class Address {
    private String name;
    private String address;
    private String tel;
    private String email;

    public Address(String name, String address, String tel, String email) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name+","+address+","+tel+","+email;
    }
}
