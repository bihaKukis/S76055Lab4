package labModule4;
// S76055 Nabiha LM4 Question 5
import javax.swing.JOptionPane;
public class l4q5 {
    
    public static void main(String[] args) {
        String distanceInput = JOptionPane.showInputDialog("Enter distance in meters:");
        double meter = Double.parseDouble(distanceInput);
        String hoursInput = JOptionPane.showInputDialog("Enter hours:");
        int hour = Integer.parseInt(hoursInput);
        String minutesInput = JOptionPane.showInputDialog("Enter minutes:");
        int minute = Integer.parseInt(minutesInput);
        String secondsInput = JOptionPane.showInputDialog("Enter seconds:");
        int second = Integer.parseInt(secondsInput);

        double km = meter / 1000;
        double miles = meter / 1609;
        int totalsec = (hour * 3600) + (minute * 60) + second;
        double totalhour = hour + (minute / 60) + (second / 3600);

        double speedmps = meter / totalsec;
        double speedkph = km / totalhour;
        double speedmph = miles / totalhour;

        String message = String.format(
            "Speed:\n- Meters per second: %.2f\n- Kilometers per hour: %.2f\n- Miles per hour: %.2f",
            speedmps, speedkph, speedmph
        );
        JOptionPane.showMessageDialog(null, message);
    }
}