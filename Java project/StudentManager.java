import java.util.Scanner;
public class StudentManager {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name=input.nextLine();

        System.out.print("Enter age: ");
        int age=input.nextInt();

        System.out.print("Enter grade 1: ");
        double grade1=input.nextDouble();

        System.out.print("Enter grade 2: ");
        double grade2=input.nextDouble();

        System.out.print("Enter grade 3: ");
        double grade3=input.nextDouble();

        Student student = new Student(name, age, grade1, grade2, grade3);

        System.out.println("\n---Student Details---");
        student.displayStudentDetails();

        input.close();

    }
    
}
