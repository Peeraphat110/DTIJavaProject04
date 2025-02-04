package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BMIProject2 {
    public static void main(String[] args) {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("    BMI Program by DTI-SAU    ");
            System.out.println("++++++++++++++++++++++++++++++");

            System.out.print("Input your name: ");
            String name = reader.readLine();
            System.out.print("Input your weight (kg): ");
            double weight = Double.parseDouble(reader.readLine());
            System.out.print("Input your height (m): ");
            double height = Double.parseDouble(reader.readLine());
        }
    }
}
