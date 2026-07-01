import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Math Marks: ");
        int math = sc.nextInt();

        System.out.print("English Marks: ");
        int english = sc.nextInt();

        System.out.print("Physics Marks: ");
        int physics = sc.nextInt();

        System.out.print("Chemistry Marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Computer Marks: ");
        int computer = sc.nextInt();

        int total = math + english + physics + chemistry + computer;

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("\n========== REPORT ==========");

        System.out.println("Student : " + name);
        System.out.println("Total : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);

        System.out.println("============================");

        sc.close();
    }
}