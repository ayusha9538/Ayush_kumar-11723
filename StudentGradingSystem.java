import java.util.*;
class Student {
    private String name;
    private int[] marks;
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    double calculateavg() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    char assigngrade() {
        double avg = calculateavg();
        if (avg >= 90) {
            return 'A';
        } 
        else if (avg >= 75) {
            return 'B';
        } 
        else if (avg >= 60) {
            return 'C';
        } 
        else if (avg >= 50) {
            return 'D';
        } 
        else {
            return 'F';
        }
    }
    void display() {
        System.out.println("\nSTUDENT REPORT");
        System.out.println("Student Name : " + name);
        System.out.print("Marks : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Average : " + calculateavg());
        System.out.println("Grade : " + assigngrade());
    }
}
public class studentgrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter Marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        Student s1 = new Student(name, marks);
        s1.display();
    }
}
