
    

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter details for the first student:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        System.out.print("GPA: ");
        double gpa1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter details for the second student:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        System.out.print("GPA: ");
        double gpa2 = scanner.nextDouble();
        scanner.close(); 

        
        Student student1 = new Student(name1, age1, gpa1);
        Student student2 = new Student(name2, age2, gpa2);

        
        System.out.println(student1.name + " is an honour student: " + student1.isHonourStudent());
        System.out.println(student2.name + " is an honour student: " + student2.isHonourStudent());


        System.out.println("Total number of Student objects created: " + Student.getTotalStudents());
    }
}
