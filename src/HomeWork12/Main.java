package HomeWork12;

public class Main {

   public static void main(String[] args) {
      Profession profession = new Profession("worker", "qualited");
      Employee employee = new Employee("Sirkova Maryna Gennadievna",
              profession,
              " sirkovamarina7@gmail.com",
              "095-562-73-01", 27);
      String fullTitlePosition = employee.fullTitlePosition();
      employee.printInformation();
   }
}
