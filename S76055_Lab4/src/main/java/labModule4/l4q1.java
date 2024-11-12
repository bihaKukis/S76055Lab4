package labModule4;
// S76055 Nabiha LM4 Question 1
import java.util.Scanner;
public class l4q1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter first integer: ");
            int num1 = input.nextInt();
            System.out.print("Enter second integer: ");
            int num2 = input.nextInt();
            int squarel = num1*num1;
            int square2 = num2*num2;
            int sumSquare = squarel + square2;
            int diffSquare = squarel - square2;
        System.out.println("The square of " + num1 +" is " + squarel);
        System.out.println("The square of " + num2 +" is " +square2);
        System.out.println("The sum of the squares is " +sumSquare);
        System.out.println("The difference of the squares is " +diffSquare);
    
    }
}
