package homeWork11;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("John",30,"Engineer");
        Person person2 = new Person("Mary", 25, "Teacher");
        Person person3 = new Person("Bob", 35, "Doctor");
        Person person4 = new Person("Alice", 28, "Architect");

        person1.printInformation();
        person2.printInformation();
        person3.printInformation();

        System.out.println(" ");
        person4.printInformation();
        System.out.println("(After updating the profession)");
        person4.setProfession("Designer");
        person4.printInformation();
    }
}
