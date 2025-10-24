package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    private List<Student> students = new ArrayList<>();

    {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int age) {
        try {
            Student student = new Student(name, age);
            students.add(student);
            System.out.println("✅ Сәтті қосылды: " + student);
        } catch (InvalidAgeException e) {
            System.out.println("⚠ Қате: " + e.getMessage());
        }
    }

    public void showAll() {
        System.out.println("\n📚 Барлық студенттер тізімі:");
        if (students.isEmpty()) {
            System.out.println("Тізім бос.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();

        System.out.println("=== Студенттерді қосу бағдарламасы ===");
        String choice;

        do {
            System.out.print("\nАты: ");
            String name = sc.nextLine();

            System.out.print("Жасы: ");
            int age = sc.nextInt();
            sc.nextLine(); // буфер тазалау

            school.addStudent(name, age);

            System.out.print("Тағы студент қосу керек пе? (ия/жоқ): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("ия"));

        school.showAll();
        sc.close();
    }
}