
import javax.swing.JOptionPane;
public class trueOrFalse {
    public void trueFalseGame() { 


        while(JOptionPane.showConfirmDialog(null, "Is this your fav class?", "Is this your fav class?", JOptionPane.YES_NO_OPTION) != 0){
            JOptionPane.showMessageDialog(null, "Oh no, you got it wrong", null, 0);
        }
        JOptionPane.showMessageDialog(null, "Yes! The couse code is ICS4U!"); //display message
        /* 

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
        */
        
    }
}