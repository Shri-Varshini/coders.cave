import java.text.DecimalFormat;
import java.util.Scanner;
public class bmicalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches:");
        double height = input.nextDouble();
        input.close();
        double bmi = weight/Math.pow(height,2)*703;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is:" + df.format(bmi));
    }
}