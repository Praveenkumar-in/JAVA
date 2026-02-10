package Basic;

import java.util.Scanner;

public class forloop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entern how many time :");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("enter the word :");
        String word = sc.nextLine();



        for (int i=1; i <= num;i++){
            System.out.println(word);
        }
        sc.close();
    }
}
