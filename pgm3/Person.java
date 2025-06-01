package pgm3;
public class Person {
    String name;
    String dob; // Format: YYYY-MM-DD

    Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }

    void displayAge() {
        // Extract year from dob assuming format is YYYY-MM-DD
        String yearString = dob.substring(0, 4);
        int birthYear = Integer.parseInt(yearString);
        int currentYear = 2025; // Hardcoded current year
        int age = currentYear - birthYear;

        System.out.println("Age: " + age);
    }
}

