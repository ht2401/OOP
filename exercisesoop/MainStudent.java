package exercisesoop;

import java.util.Scanner;

public class MainStudent {
    static Scanner scanner = new Scanner(System.in);

    static void Input(Student tt) {
        System.out.println("Enter student code : ");
        tt.setStudentCode(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter student's first and last name : ");
        tt.setFullName(scanner.nextLine());
        System.out.println("Enter student address : ");
        tt.setAddress(scanner.nextLine());
        do {
            System.out.println("Enter student phone number : ");
            tt.setPhoneNumber(scanner.nextLine());
        } while (tt.getPhoneNumber().length() != 7);
    }

    public static void main(String[] args) {
        Student student[] = null;
        System.out.println("Enter the number of students :");
        int number = scanner.nextInt();
        student = new Student[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Second student " + (i + 1));
            student[i] = new Student();
            Input(student[i]);
        }
        System.out.printf("%-5s %-15s %-15s %-20s \n", "Student code", "First and last name", "Address", "Phone number");
        for (int i = 0; i < number; i++) {
            student[i].displayInformation();
        }

        Student temp = student[0];
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i].getStudentCode() > student[j].getStudentCode()) {
                    temp = student[j];
                    student[j] = student[i];
                    student[i] = temp;
                }
            }
        }
        System.out.println("List of students sorted in ascending order by student number : ");
        System.out.printf("%-5s %15s %15s %20s \n", "Student code", "First and last name", "Address", "Phone number");
        for (int i = 0; i < number; i++) {
            student[i].displayInformation();
        }
    }
}
