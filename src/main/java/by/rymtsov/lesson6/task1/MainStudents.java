package main.java.by.rymtsov.lesson6.task1;

/**
 * This is the main class for the class Student.
 * Here we have an array with students.
 */

public class MainStudents {
    public static void main(String[] args) {
        Student[] students = new Student[15];
        students[0] = new Student("Chikipibarumskiy", "Arima", "MPxxx", "C32-onl", 18);
        students[1] = new Student("Samedov", "Sultan", "MPxxx", "C32-onl", 29);
        students[2] = new Student("Kisel", "Sergey", "MPxxx", "C32-onl", 25);
        students[3] = new Student("Shikibary", "Dmtiriy", "MPxxx", "C32-onl", 18);
        students[4] = new Student("Dancingiswhatyoudorov", "Vlad", "MPxxx", "C32-onl", 18);
        students[5] = new Student("Skrobutan", "Igor", "MPxxx", "C32-onl", 18);
        students[6] = new Student("Harevich", "Daniil", "MPxxx", "C32-onl", 18);
        students[7] = new Student("Rublevskaya", "Kate", "MPxxx", "C32-onl", 19);
        students[8] = new Student("Hmara", "Dmitriy", "MPxxx", "C32-onl", 18);
        students[9] = new Student("Shilindr", "Kirill", "MPxxx", "C32-onl", 18);
        students[10] = new Student("Yadevich", "Marina", "MPxxx", "C32-onl", 25);
        students[11] = new Student("Savickiy", "Oleg", "MPxxx", "C32-onl", 18);
        students[12] = new Student("Reges", "Kirill", "MPxxx", "C32-onl", 18);
        students[13] = new Student("Sinauskaya", "Rita", "MPxxx", "C32-onl", 18);
        students[14] = new Student("Rymtsov", "Ilya", "MPxxx", "C32-onl", 18);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
