package Basic;
import java.util.Scanner;

public class Array {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        System.out.println("Enter 4 numbers:");

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Stored values:");

        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
