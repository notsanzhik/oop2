import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Employee Maxim = new Employee("Maxim", "Samarin", "Manager", 27045.78);
        people.add(Maxim);
        Employee Askar = new Employee("Askar", "Kuatbekov", "Developer", 50000.00);
        people.add(Askar);
        Student Madi = new Student("Madi", "Talgat", 2.0);
        people.add(Madi); // no
        Student Sanzhar = new Student("Sanzhar", "Zhunisbay", 2.8);
        people.add(Sanzhar); // yes

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.printf("%s earns %.2f tenge%n", p.toString(), p.getPaymentAmount());
        }
    }
}