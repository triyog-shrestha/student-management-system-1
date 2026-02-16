import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter student roll no: ");
        int rollno = sc.nextInt();

        System.out.print("Enter marks for subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int mark3 = sc.nextInt();

        StoreData s1 = new StoreData(name,rollno, mark1,mark2,mark3);
        Calculate c1 = new Calculate();

        c1.calculateAverage(s1);
        c1.calculateGrade(s1);

        s1.getDetails();

    }
}
