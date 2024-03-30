package codingproblems.object;

// an example program demonstrating how to pass and return a mutable object to/from an immutable class

// Mutable class representing a Person
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Immutable class representing a PersonDetails
record PersonDetails(String name) {

    // Method to create an instance of PersonDetails from a mutable Person object
    public static PersonDetails fromPerson(Person person) {
        return new PersonDetails(person.getName());
    }

    // Method to create a mutable Person object from an instance of PersonDetails
    public Person toPerson() {
        return new Person(name);
    }
}

public class PassAndReturnMutableObject {
    public static void main(String[] args) {
        // Create a mutable Person object
        Person person = new Person("John");

        // Pass the mutable Person object to the immutable PersonDetails class
        PersonDetails personDetails = PersonDetails.fromPerson(person);

        // Retrieve details from the immutable PersonDetails object
        System.out.println(STR."Name from PersonDetails: \{personDetails.name()}");

        // Modify the mutable Person object
        person.setName("Jane");

        // Retrieve details from the mutable Person object
        System.out.println(STR."Name from Person: \{person.getName()}");

        // Convert immutable PersonDetails object back to a mutable Person object
        Person updatedPerson = personDetails.toPerson();

        // Retrieve details from the updated mutable Person object
        System.out.println(STR."Updated Name from Person: \{updatedPerson.getName()}");
    }
}
