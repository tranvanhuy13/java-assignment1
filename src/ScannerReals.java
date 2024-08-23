import java.util.Scanner;

public class ScannerReals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        System.out.print("Enter your gender(male/female): ");
        String gender = scanner.next();
        scanner.nextLine();
        System.out.print("Enter your major: ");
        String major = scanner.nextLine();
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your hometown: ");
        String hometown = scanner.nextLine();
        System.out.println("______YOUR INFORMATION______");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Year of birth: "+yearOfBirth);
        System.out.println("Gender: "+gender);
        System.out.println("Major: "+major);
        System.out.println("GPA: "+gpa);
        System.out.println("hometown: "+hometown);
    }
}
