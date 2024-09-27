package homeWork11;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void printInformation() {

        System.out.println("Name: "+name+", Age: "+ age+ ", Profession: "+profession );
    }
    public void setProfession(String newProfession){
        this.profession = newProfession;
    }
}
