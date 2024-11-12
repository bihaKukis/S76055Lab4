package labModule4;
// S76055 Nabiha LM4 Question 6
import java.util.Scanner;
public class l4q6 {
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        
        double mean = (x1+x2+x3)/3;
        double variance = ((Math.pow((x1 - mean),2))+
                          (Math.pow((x2- mean),2))+
                          (Math.pow((x3- mean),2)))/ 3;
        double stdDev = Math.pow(variance, 0.5);
        
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Variance: %.2f%n", variance);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);
    }
}
