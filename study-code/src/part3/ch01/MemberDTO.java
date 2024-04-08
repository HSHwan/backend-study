package part3.ch01;

public class MemberDTO {
    private String name;
    private int age;
    private String phone;
    private String email;
    private String addr;
    private float weight;

    public MemberDTO(String name, int age, String phone, String email, String addr, float weight) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.addr = addr;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
