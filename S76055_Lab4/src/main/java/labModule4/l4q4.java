package labModule4;
// S76055 Nabiha LM4 Question 4
import javax.swing.JOptionPane;
public class l4q4 {
        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Enter string: "); 
            String convertedString = "";
    
             for (int i = 0; i < input.length(); i++){
            char chr = input.charAt(i);
            //check
            if (chr >= 'a' && chr <= 'z'){
                convertedString += Character.toUpperCase(chr);
        }   else if  (chr >= 'A' && chr <= 'Z'){
                convertedString += Character.toLowerCase(chr);
        }   else {
            //if not letter
                convertedString += chr;
        }
    }
    JOptionPane.showMessageDialog(null, "Converted string: " + convertedString);
    }
}