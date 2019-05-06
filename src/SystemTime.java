import java.util.Scanner;

public class SystemTime {
    public static void main(String[] args) {
        System.out.println("This program calculate the solution for y = a*x + b");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        float a = scanner.nextFloat();
        System.out.println("Input b:");
        float b = scanner.nextFloat();
        System.out.println("Input y:");
        float y = scanner.nextFloat();

        if (a == 0) {
            if (y - b != 0) {
                System.out.println("There is no solution.");
            } else {
                System.out.println("The solution is all x");
            }
        } else {
            float x = (y - b) / a;
            System.out.println("The solution is: " + x);
        }
    }
}