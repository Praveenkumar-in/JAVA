import java.util.Scanner;

public class BarEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Welcome " + name + ", you can enter into the bar.");
            System.out.println("Please add a drink 🍺");
        } else {
            System.out.println("Sorry " + name + ", you are not allowed.");
        }
    }
}