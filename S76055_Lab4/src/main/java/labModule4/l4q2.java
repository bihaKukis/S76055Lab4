package labModule4;
// S76055 Nabiha LM4 Question 2
import javax.swing.JOptionPane;
public class l4q2 {
    
    public static void main(String[] args){
        final double PI = 3.14159; //define pi
        String input = JOptionPane.showInputDialog("Enter the radius of a circle: ");
        double radius = Double.parseDouble(input);
        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * Math.pow(radius,2);
    String message = String.format("""
                                   The diameter of the circle is %.2f
                                   The circumference of the circle  is %.2f
                                   The area of the circle is %.2f""", diameter, circumference, area);
    JOptionPane.showMessageDialog(null, message);
    }
}
