package main.java.by.rymtsov.lesson6.task1;

/**
 * This is the class that describes a student.
 * I override toString method to output the information about the student.
 */

public class Student {
    String firstName;
    String lastName;
    String passportNumber;
    String groupName;
    int age;

    public Student(String lastName, String firstName, String passportNumber, String groupName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "First name: " + firstName +
                "\nSecond name: " + lastName +
                "\nPassportNumber " + passportNumber +
                "\nGroup name: " + groupName +
                "\nAge: " + age +
                '\n';
    }
}
