package workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("    BMI Program by DTI-SAU    ");
        System.out.println("++++++++++++++++++++++++++++++");

        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input your weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Input your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.printf("BMI of %s is %.3f%n", name, bmi);
        System.out.println("++++++++++++++++++++++++++++++");
        scanner.close();
    }
}
