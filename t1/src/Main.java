import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Choose, 1 2 or 3");
        float choice = console.nextFloat();
        if (choice == 1) {
            System.out.println("Write n");
            float n = console.nextFloat();
            System.out.println("Write m");
            float m = console.nextFloat();
            double result = ((n + m) * (m - 4) + m * n - Math.pow(n, 4) + Math.pow(m, 3)) / Math.pow((m + 2), 2);
            System.out.println("result=" + result);
        }
        else if (choice == 2) {
            System.out.println("Write n");
            int n = console.nextInt();
            System.out.println("Write m");
            int m = console.nextInt();
            double result = ((n + m) * (m - 4) + m * n - Math.pow(n, 4) + Math.pow(m, 3)) / Math.pow((m + 2), 2);
            System.out.println("result=" + result);

        }
        else if (choice == 3) {
            System.out.println("Write n");
            float n = console.nextFloat();
            System.out.println("Write m");
            float m = console.nextFloat();
            int result = (int) (((n + m) * (m - 4) + m * n - Math.pow(n, 4) + Math.pow(m, 3)) / Math.pow((m + 2), 2));
            System.out.println("result=" + result);
        }


    }

}