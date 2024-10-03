package HomeWork12;

public class Employee {
    private String fullName;
    private Profession profession;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String fullName,
                    Profession profession,
                    String email,
                    String phoneNumber,
                    int age) {
        this.fullName = fullName;
        this.profession = profession;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String fullTitlePosition(){
        return this.profession.getPosition()+" "+profession.getGrade();
    }
public String getFullName(){
    return fullName;
}
public String getEmail() {
    return email;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public int getAge() {
    return age;
}

public void setFullName(String fullName) {
        this.fullName = fullName;
}

public void setEmail(String email) {
        this.email = email;
}

public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
}

public void setAge(int age) {
        this.age = age;
}

    public void printInformation(){
    System.out.println(fullName + ", " + fullTitlePosition() + ", " + email + ", "
    + phoneNumber + ", " + age+ " years");
}
}
