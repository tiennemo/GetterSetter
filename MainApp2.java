package advance.dev;
import java.util.Scanner;

public class MainApp2 {
    private static final int NUM_STUDENTS = 10;

    public static void main(String[] args) {
        Student[] students = new Student[NUM_STUDENTS];

        input(students);
        System.out.println("List of students:");
        print(students);
        sortStudentsByAverageScore(students);
        System.out.println("List of students sorted by average score:");
        print(students);
    }

    public static void input(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Average score: ");
            double averageScore = Double.parseDouble(scanner.nextLine());

            students[i] = new Student(name, age, address, phoneNumber, averageScore);
        }
        scanner.close();
    }

    public static void print(Student[] students) {
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println("Address: " + students[i].getAddress());
            System.out.println("Phone number: " + students[i].getPhoneNumber());
            System.out.println("Average score: " + students[i].getAverageScore());
            System.out.println();
        }
    }

    public static void sortStudentsByAverageScore(Student[] students) {
        for (int i = 0; i < NUM_STUDENTS - 1; i++) {
            for (int j = 0; j < NUM_STUDENTS - i - 1; j++) {
                if (students[j].getAverageScore() > students[j + 1].getAverageScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}