package GuessNumberJava;
import javax.swing.JOptionPane;
public class trueOrFalse {
    public static void trueOrFalse(String[] args) {
        boolean start = true; //creating boolean for while loop
        while (start){
            String tOrF = JOptionPane.showInputDialog("Is the course code for our class ICS4U? [T] or [F]"); //getting input as a string
            if (tOrF.equals("T")){ //if string equals T
                start = false; //end loop
                JOptionPane.showMessageDialog(null, "Yes! The couse code is ICS4U!"); //display message
            }
            else { //otherwise F was entered, or something else entirely. program loops
                JOptionPane.showMessageDialog(null, "Try again!");
            }
        }
    }
}