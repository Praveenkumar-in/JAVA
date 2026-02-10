import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your attendance percentage: ");
        int attendancePercentage = sc.nextInt();

        switch (attendancePercentage / 10) {

            case 10:
            case 9:
            case 8:
                System.out.println("You are allowed to write exam. Attendance = "
                        + attendancePercentage + "%");
                break;

            case 7:
                System.out.println("Attendance is borderline = "
                        + attendancePercentage + "%");
                break;

            default:
                System.out.println("Attendance is bad — not allowed");
        }

        sc.close();
    }
}